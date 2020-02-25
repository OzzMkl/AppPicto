package co.mkl.picto2.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.mkl.picto2.MainActivity;
import co.mkl.picto2.R;

public class p2 extends AppCompatActivity {

    Button btnAtr, btnF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);

        btnAtr  =(Button)findViewById(R.id.btnAtras);
        btnF    =(Button)findViewById(R.id.btnFin);

        btnAtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iAtr = new Intent(p2.this,MainActivity.class);
                startActivity(iAtr);
            }
        });
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iF   = new Intent(p2.this, p1.class);

            }
        });
    }
}
