package sg.edu.rp.c346.id20037834.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvModule1;
    TextView tvModule2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModule1 = findViewById(R.id.tvModule1);
        tvModule2 = findViewById(R.id.tvModule2);

        tvModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent showModuleAndroid = new Intent(MainActivity.this, ModuleDetails.class);
                showModuleAndroid.putExtra("moduleCode" , "C346");
                showModuleAndroid.putExtra("moduleName", "Android Programming");
                showModuleAndroid.putExtra("moduleYear", "2020");
                showModuleAndroid.putExtra("moduleSemester", "1");
                showModuleAndroid.putExtra("moduleCredit", "4");
                showModuleAndroid.putExtra("moduleVenue", "W66M");
                startActivity(showModuleAndroid);


            }
        });
    }
}