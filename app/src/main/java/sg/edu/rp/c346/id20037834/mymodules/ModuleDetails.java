package sg.edu.rp.c346.id20037834.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetails extends AppCompatActivity {

    TextView tvShowAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        tvShowAnswer = findViewById(R.id.tvShowModule);

        Intent intentReceived = getIntent();
        String intentStringCode = intentReceived.getStringExtra("moduleCode");
        String intentStringName = intentReceived.getStringExtra("moduleName");
        int intentIntYear = intentReceived.getIntExtra("moduleYear", 2020);
        int intentIntSemester = intentReceived.getIntExtra("moduleSemester" , 1);
        int intentIntCredit = intentReceived.getIntExtra("moduleCredit", 4);
        String intentStringVenue = intentReceived.getStringExtra("moduleVenue");

        tvShowAnswer.setText("Module Code: " + intentStringCode + "\n" +
                "Module Name: " + intentStringName + "\n" + "Academic Year: " + intentIntYear +
                "\n" + "Semester: " + intentIntSemester + "\n" + "Module Credit: " + intentIntCredit + "\n" +
                "Venue: " + intentStringVenue);


    }
}