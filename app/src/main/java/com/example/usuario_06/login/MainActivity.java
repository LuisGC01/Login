package com.example.usuario_06.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tUsuario;
    EditText tCont;
    Button btnValidar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tUsuario=(EditText)findViewById(R.id.tUsuario);
        tCont=(EditText)findViewById(R.id.tCont);
        btnValidar=(Button)findViewById(R.id.btnValidar);

        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tUsuario.getText().toString().equals("Luis") && tCont.getText().toString().equals("Hola")){
                    
                }
            }
        });

    }
}
