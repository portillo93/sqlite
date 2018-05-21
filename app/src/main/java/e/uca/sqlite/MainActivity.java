package e.uca.sqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import e.uca.sqlite.entidades.DBHelper;

public class MainActivity extends AppCompatActivity {
    private Button btn_registar, btn_consultar, btn_consultarS, getBtn_consultarS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarControles();
        DBHelper.getInstance(this);

        btn_registar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), RegistrarActivity.class);
                startActivity(intent);
            }
        });

        btn_consultar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), ModificarActivity.class);
                startActivity(intent);
            }
        });
    }

    private void inicializarControles() {
        btn_registar = findViewById(R.id.mostrarRegistro);
        btn_consultar = findViewById(R.id.consultar_usuario);
    }
}
