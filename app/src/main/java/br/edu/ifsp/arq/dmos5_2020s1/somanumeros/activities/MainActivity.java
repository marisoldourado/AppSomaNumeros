package br.edu.ifsp.arq.dmos5_2020s1.somanumeros.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.edu.ifsp.arq.dmos5_2020s1.somanumeros.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private EditText n1EditText;
    private EditText n2EditText;
    private EditText n3EditText;
    private Button somarButon;
    private TextView saidaTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1EditText = findViewById(R.id.edittext_n1);
        n2EditText = findViewById(R.id.edittext_n2);
        n3EditText = findViewById(R.id.edittext_n3);
        saidaTxtView = findViewById(R.id.txtview_saida);
        somarButon = findViewById(R.id.buttonSomar);

        somarButon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == somarButon) {
            somar();
        }
    }

    private void somar() {
        double n1, n2, n3, soma;

        try {
            n1 = Double.valueOf(n1EditText.getText().toString());
            n2 = Double.valueOf(n2EditText.getText().toString());
            n3 = Double.valueOf(n3EditText.getText().toString());


        }
        catch (NumberFormatException ex) {
            n1 = 0;
            n2 = 0;
            n3 = 0;

            Toast.makeText(this, "Erro na entrada de dados", Toast.LENGTH_LONG).show();

            return;
        }

        soma = n1 + n2 + n3;
        saidaTxtView.setText(String.format("Resultado da soma: %.2f", soma));
       // Toast.makeText(this, String.format("Resultado da soma: %.2f", soma), Toast.LENGTH_LONG).show();
    }
}
