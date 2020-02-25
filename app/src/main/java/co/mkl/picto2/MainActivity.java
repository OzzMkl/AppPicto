package co.mkl.picto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.mkl.picto2.Actividades.p1;
import co.mkl.picto2.Actividades.p2;

public class MainActivity extends AppCompatActivity {

    Button btnSgt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSgt = (Button)findViewById(R.id.btnSiguiente);//instaciamos el boton de xml con la app
        btnSgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, p2.class);
                startActivity(intent);
                overridePendingTransition(R.transition.slide_in_right, R.transition.slide_out_left);
            }
        });
    }
}
