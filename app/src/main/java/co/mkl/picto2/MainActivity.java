package co.mkl.picto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import co.mkl.picto2.Actividades.p2;

public class MainActivity extends AppCompatActivity {

    ImageView bsig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bsig = (ImageView)findViewById(R.id.bsiguiente);
        bsig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bs = new Intent(MainActivity.this,p2.class);
                startActivity(bs);
                overridePendingTransition(R.transition.slide_in_right, R.transition.slide_out_left);
            }
        });
    }
}
