package edu.co.upb.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import edu.co.upb.appprueba.util.Datos;

public class LoginInicio extends AppCompatActivity {
    //Declaracion de un miembro dato de la clase
    private Button btn_login;
    private Datos dato;
    private Button btn_registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dato = (Datos) (this.getApplication());

        //le damos identidad encontrando la ID que pusimos en el .xml y le damos vida al boton cuando lo  presionamos
        btn_login = findViewById(R.id.btn_login);
        //le asignamos el evento setOnClickListener luego new view (para que se llene el @override solo
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ponemos nuestro codigo como el intent (para solicitar otra pagina), o el Toast.makeText (para aparecer en pantalla un mensaje)
                Toast.makeText(LoginInicio.this,"se tocó la pantalla boton login",Toast.LENGTH_SHORT).show();
                Log.i("upb","mensaje que se ve en el log del Run para iniciar sesion");
                Intent home = new Intent(LoginInicio.this,Home.class); //configuramos la accion del boton desde donde estamos
                startActivity(home);
                dato.setNombre("Hamil");
            }

        });
        btn_registrar = findViewById(R.id.btn_registrar);
        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrar = new Intent(LoginInicio.this,Registro.class);
                startActivity(registrar);
            }
        });
    }
}