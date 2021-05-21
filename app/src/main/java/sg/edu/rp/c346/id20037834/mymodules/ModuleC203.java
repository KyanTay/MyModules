package sg.edu.rp.c346.id20037834.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleC203 extends AppCompatActivity {

    TextView tvShowC203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_c203);

        tvShowC203 = findViewById(R.id.tvShowC203Module);

        Intent showC203Intent = getIntent();
        String intentStringCode = showC203Intent.getStringExtra("moduleCodeC203");
        String intentStringName = showC203Intent.getStringExtra("moduleNameC203");
        int intentIntYear = showC203Intent.getIntExtra("moduleYearC203", 2021);
        int intentIntSemester = showC203Intent.getIntExtra("moduleSemesterC203" , 1);
        int intentIntCredit = showC203Intent.getIntExtra("moduleCreditC203", 4);
        String intentStringVenue = showC203Intent.getStringExtra("moduleVenueC203");

        tvShowC203.setText("Module Code: " + intentStringCode + "\n" +
                "Module Name: " + intentStringName + "\n" + "Academic Year: " + intentIntYear +
                "\n" + "Semester: " + intentIntSemester + "\n" + "Module Credit: " + intentIntCredit + "\n" +
                "Venue: " + intentStringVenue);
    }
}