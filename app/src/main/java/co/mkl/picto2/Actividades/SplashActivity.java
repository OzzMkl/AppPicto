package co.mkl.picto2.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import co.mkl.picto2.MainActivity;
import co.mkl.picto2.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        long delayMillis= 3000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent( SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, delayMillis);
    }
}
