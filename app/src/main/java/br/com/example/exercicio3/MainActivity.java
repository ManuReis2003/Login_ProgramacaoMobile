package br.com.example.exercicio3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); //faz as coisas aparecerem na tela

        EditText usuario = findViewById(R.id.usuario);
        EditText senha = findViewById(R.id.senha);
        Button enviar = findViewById(R.id.botao);

        enviar.setOnClickListener(new View.OnClickListener() {  //método para definir ação do botão
            @Override
            public void onClick(View v) {
                if ( usuario.getText().toString().equals("admin")  && senha.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "Login realizado!", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this, "Login incorreto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
