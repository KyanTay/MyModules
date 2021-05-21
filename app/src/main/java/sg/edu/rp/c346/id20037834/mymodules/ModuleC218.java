package sg.edu.rp.c346.id20037834.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleC218 extends AppCompatActivity {

    TextView tvShowC218;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_c218);

        tvShowC218 = findViewById(R.id.tvC218);

        Intent showC218Intent = getIntent();
        String intentStringCode = showC218Intent.getStringExtra("moduleCodeC218");
        String intentStringName = showC218Intent.getStringExtra("moduleNameC218");
        int intentIntYear = showC218Intent.getIntExtra("moduleYearC218", 2021);
        int intentIntSemester = showC218Intent.getIntExtra("moduleSemesterC218" , 1);
        int intentIntCredit = showC218Intent.getIntExtra("moduleCreditC218", 4);
        String intentStringVenue = showC218Intent.getStringExtra("moduleVenueC218");

        tvShowC218.setText("Module Code: " + intentStringCode + "\n" +
                "Module Name: " + intentStringName + "\n" + "Academic Year: " + intentIntYear +
                "\n" + "Semester: " + intentIntSemester + "\n" + "Module Credit: " + intentIntCredit + "\n" +
                "Venue: " + intentStringVenue);
    }
}