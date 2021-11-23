package edu.co.upb.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class InicioAplicacion extends AppCompatActivity {
    //Declaracion de un miembro dato de la clase
    private Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(InicioAplicacion.this,"se tocó la pantalla",Toast.LENGTH_SHORT);
                Log.i("upb","mensaje para la universidad");
            }
        });
    }
}