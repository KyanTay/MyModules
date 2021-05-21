package sg.edu.rp.c346.id20037834.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleC206 extends AppCompatActivity {

    TextView showC206ModuleDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_c206);

        showC206ModuleDetails = findViewById(R.id.tvShowC206);

        Intent showC206Intent = getIntent();
        String intentStringCode = showC206Intent.getStringExtra("moduleCodeC206");
        String intentStringName = showC206Intent.getStringExtra("moduleNameC206");
        int intentIntYear = showC206Intent.getIntExtra("moduleYearC206", 2021);
        int intentIntSemester = showC206Intent.getIntExtra("moduleSemesterC206" , 1);
        int intentIntCredit = showC206Intent.getIntExtra("moduleCreditC206", 4);
        String intentStringVenue = showC206Intent.getStringExtra("moduleVenueC206");

        showC206ModuleDetails.setText("Module Code: " + intentStringCode + "\n" +
                "Module Name: " + intentStringName + "\n" + "Academic Year: " + intentIntYear +
                "\n" + "Semester: " + intentIntSemester + "\n" + "Module Credit: " + intentIntCredit + "\n" +
                "Venue: " + intentStringVenue);
    }
}