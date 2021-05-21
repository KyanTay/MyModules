package sg.edu.rp.c346.id20037834.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleC235 extends AppCompatActivity {

    TextView c235Details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_c235);

        c235Details = findViewById(R.id.tvC235);
        Intent intentC235Receive = getIntent();

        String intentStringCode = intentC235Receive.getStringExtra("moduleCodeC235");
        String intentStringName = intentC235Receive.getStringExtra("moduleNameC235");
        int intentIntYear = intentC235Receive.getIntExtra("moduleYearC235", 2021);
        int intentIntSemester = intentC235Receive.getIntExtra("moduleSemesterC235" , 1);
        int intentIntCredit = intentC235Receive.getIntExtra("moduleCreditC235", 4);
        String intentStringVenue = intentC235Receive.getStringExtra("moduleVenueC235");

        c235Details.setText("Module Code: " + intentStringCode + "\n" +
                "Module Name: " + intentStringName + "\n" + "Academic Year: " + intentIntYear +
                "\n" + "Semester: " + intentIntSemester + "\n" + "Module Credit: " + intentIntCredit + "\n" +
                "Venue: " + intentStringVenue);
    }
}