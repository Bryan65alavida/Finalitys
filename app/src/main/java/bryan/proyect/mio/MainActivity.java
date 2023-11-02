package bryan.proyect.mio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Cauto;
    Button Ccamioneta;
    Button Ccamion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cauto = findViewById(R.id.btnAuto);
        Ccamioneta = findViewById(R.id.btnCamioneta);
        Ccamion = findViewById(R.id.btnCamion);

        Cauto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TipoServicio.class));
            }
        });

        Ccamioneta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TipoServicio.class));
            }
        });
        Ccamion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TipoServicio.class));
            }
        });
    }

}