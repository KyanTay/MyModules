package sg.edu.rp.c346.id20037834.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetails extends AppCompatActivity {

    TextView tvShowAnswer;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        tvShowAnswer = findViewById(R.id.tvShowModule);
        btnBack = findViewById(R.id.btnBack);

        Intent intentReceived = getIntent();
        String intentStringCode = intentReceived.getStringExtra("moduleCode");
        String intentStringName = intentReceived.getStringExtra("moduleName");
        int intentIntYear = intentReceived.getIntExtra("moduleYear", 2021);
        int intentIntSemester = intentReceived.getIntExtra("moduleSemester" , 1);
        int intentIntCredit = intentReceived.getIntExtra("moduleCredit", 4);
        String intentStringVenue = intentReceived.getStringExtra("moduleVenue");

        tvShowAnswer.setText("Module Code: " + intentStringCode + "\n" +
                "Module Name: " + intentStringName + "\n" + "Academic Year: " + intentIntYear +
                "\n" + "Semester: " + intentIntSemester + "\n" + "Module Credit: " + intentIntCredit + "\n" +
                "Venue: " + intentStringVenue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBackPage = new Intent(ModuleDetails.this, MainActivity.class);
                startActivity(intentBackPage);
            }
        });

    }
}