package com.example.franciscoestaun.actividad5;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class Actividad_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_5);
        Button btnEnvio = (Button) findViewById(R.id.btnEnviar);

        btnEnvio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected = -1;
                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    Spinner spinner = (Spinner) findViewById(R.id.spinActivity);
                    selected = spinner.getSelectedItemPosition();
                } else {
                    RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rGrpActs);
                    if (radioGroup.getCheckedRadioButtonId() != -1) {
                        int id = radioGroup.getCheckedRadioButtonId();
                        View radioButton = radioGroup.findViewById(id);
                        selected = radioGroup.indexOfChild(radioButton);
                    }
                }
                if (selected == 0) {
                    Intent intent = new Intent(getApplicationContext(), Activity_1.class);
                    startActivity(intent);
                } else if (selected == 1) {
                    Intent intent = new Intent(getApplicationContext(), Activity_2.class);
                    startActivity(intent);
                }
            }
        });
    }


}
