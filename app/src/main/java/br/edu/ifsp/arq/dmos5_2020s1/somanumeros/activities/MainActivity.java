package br.edu.ifsp.arq.dmos5_2020s1.somanumeros.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.ifsp.arq.dmos5_2020s1.somanumeros.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private EditText n1EditText;
    private EditText n2EditText;
    private Button somarButon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1EditText = findViewById(R.id.edittext_n1);
        n2EditText = findViewById(R.id.edittext_n2);
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
        double n1, n2, soma;

        try {
            n1 = Double.valueOf(n1EditText.getText().toString());
            n2 = Double.valueOf(n2EditText.getText().toString());

        }
        catch (NumberFormatException ex) {
            n1 = 0;
            n2 = 0;

            Toast.makeText(this, "Erro na entrada de dados", Toast.LENGTH_LONG).show();

            return;
        }

        soma = n1 + n2;
        Toast.makeText(this, String.format("%.2f", soma), Toast.LENGTH_LONG).show();
    }
}
