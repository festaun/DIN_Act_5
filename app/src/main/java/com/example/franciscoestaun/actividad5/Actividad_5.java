package com.example.franciscoestaun.actividad5;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Actividad_5 extends AppCompatActivity {

    Button btnEnvio = null;
    Spinner spinner = null;
    RadioGroup radioGroup = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_5);
        aisgnarObjetos();
        btnEnvio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnEnviarMethod();
            }
        });
    }
    private void aisgnarObjetos(){
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            btnEnvio = (Button) findViewById(R.id.btnEnviar);
            spinner = (Spinner) findViewById(R.id.spinActivity);
        }else {
            btnEnvio = (Button) findViewById(R.id.button);
            radioGroup = (RadioGroup) findViewById(R.id.rGrpActs);
        }
    }
    private void btnEnviarMethod() {
        int selected = -1;
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            selected = spinner.getSelectedItemPosition();
        } else {
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


}
