package com.example.franciscoestaun.actividad5;

import android.support.annotation.NonNull;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Activity_2 extends AppCompatActivity {
    private static Toast mensajes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        GridView gView = (GridView) findViewById(R.id.gridview);
        final miAdapter adapter = new miAdapter(this, this);
        gView.setAdapter(adapter);
        gView.setOnItemClickListener(myItemclickListener(adapter));
    }

    @NonNull
    private AdapterView.OnItemClickListener myItemclickListener(final miAdapter adapter) {
        return new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if (mensajes != null)
                    mensajes.cancel();
                mensajes = Toast.makeText(getBaseContext(),
                        "Nombre: " + adapter.getFileName(position),
                        Toast.LENGTH_SHORT);
                mensajes.show();
            }
        };
    }
}
