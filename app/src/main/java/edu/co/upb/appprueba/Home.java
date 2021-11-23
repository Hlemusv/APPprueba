package edu.co.upb.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    //Declaracion de un miembro dato de la clase
    private Button btn_volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //le damos identidad encontrando la ID que pusimos en el .xml y le damos vida al boton cuando lo  presionamos
        btn_volver = findViewById(R.id.btn_volver);
        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Para mostrar informacion en pantalla
                Toast.makeText(Home.this,"se tocó la pantalla",Toast.LENGTH_SHORT).show();
               //para mostrar informacion en consola
                Log.i("upb","mensaje que se ve en RUN y dice  devuelve ");
                //para volver al LogInicio
                Intent volver = new Intent(Home.this,LoginInicio.class); //configuramos la accion del boton desde donde estamos
                startActivity(volver);
                 }
            });
    }
}