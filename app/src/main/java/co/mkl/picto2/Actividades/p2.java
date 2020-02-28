package co.mkl.picto2.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import co.mkl.picto2.MainActivity;
import co.mkl.picto2.R;

public class p2 extends AppCompatActivity {

    ImageView ibtnF,ibtnA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);

        ibtnA = (ImageView) findViewById(R.id.btnAtras);
        ibtnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  inA = new Intent(p2.this,MainActivity.class);
                startActivity(inA);
                overridePendingTransition(R.transition.slide_in_left, R.transition.slide_out_right);
            }
        });
        ibtnF = (ImageView)findViewById(R.id.btnTerminar);
        ibtnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inF = new Intent(p2.this,p1.class);
                startActivity(inF);
                overridePendingTransition(R.transition.slide_in_right, R.transition.slide_out_left);
            }
        });
    }
}
