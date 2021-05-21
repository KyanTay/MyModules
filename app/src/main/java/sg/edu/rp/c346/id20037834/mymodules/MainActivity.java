package sg.edu.rp.c346.id20037834.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvModule1;
    TextView tvModuleC203;
    TextView tvModuleC206;
    TextView tvModuleC218;
    TextView tvModuleC235;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModule1 = findViewById(R.id.tvModule1);
        tvModuleC203 = findViewById(R.id.tvModule2);
        tvModuleC206 = findViewById(R.id.tvModule3);
        tvModuleC218 = findViewById(R.id.tvModule4);
        tvModuleC235 = findViewById(R.id.tvModule5);


        tvModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent showModuleAndroid = new Intent(MainActivity.this, ModuleDetails.class);
                showModuleAndroid.putExtra("moduleCode" , "C346");
                showModuleAndroid.putExtra("moduleName", "Android Programming");
                showModuleAndroid.putExtra("moduleYear", "2021");
                showModuleAndroid.putExtra("moduleSemester", "1");
                showModuleAndroid.putExtra("moduleCredit", "4");
                showModuleAndroid.putExtra("moduleVenue", "E62E");
                startActivity(showModuleAndroid);
            }
        });

        tvModuleC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showModuleC203 = new Intent(MainActivity.this, ModuleDetails.class);
                showModuleC203.putExtra("moduleCode" , "C203");
                showModuleC203.putExtra("moduleName", "Web AppIn Development in php");
                showModuleC203.putExtra("moduleYear", "2021");
                showModuleC203.putExtra("moduleSemester", "1");
                showModuleC203.putExtra("moduleCredit", "4");
                showModuleC203.putExtra("moduleVenue", "W67L");
                startActivity(showModuleC203);
            }
        });

        tvModuleC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showModuleC206 = new Intent(MainActivity.this, ModuleDetails.class);
                showModuleC206.putExtra("moduleCode" , "C206");
                showModuleC206.putExtra("moduleName", "Software Development Process");
                showModuleC206.putExtra("moduleYear", "2021");
                showModuleC206.putExtra("moduleSemester", "1");
                showModuleC206.putExtra("moduleCredit", "4");
                showModuleC206.putExtra("moduleVenue", "W67L");
                startActivity(showModuleC206);
            }
        });

        tvModuleC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showModuleC218 = new Intent(MainActivity.this, ModuleDetails.class);
                showModuleC218.putExtra("moduleCode" , "C218");
                showModuleC218.putExtra("moduleName", "UI/UX Design for Apps");
                showModuleC218.putExtra("moduleYear", "2021");
                showModuleC218.putExtra("moduleSemester", "1");
                showModuleC218.putExtra("moduleCredit", "4");
                showModuleC218.putExtra("moduleVenue", "W64G");
                startActivity(showModuleC218);
            }
        });

        tvModuleC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showModuleC235 = new Intent(MainActivity.this, ModuleDetails.class);
                showModuleC235.putExtra("moduleCode" , "C235");
                showModuleC235.putExtra("moduleName", "IT Security and Management");
                showModuleC235.putExtra("moduleYear", "2021");
                showModuleC235.putExtra("moduleSemester", "1");
                showModuleC235.putExtra("moduleCredit", "4");
                showModuleC235.putExtra("moduleVenue", "W67L");
                startActivity(showModuleC235);
            }
        });
    }
}