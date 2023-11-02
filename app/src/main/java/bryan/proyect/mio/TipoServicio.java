package bryan.proyect.mio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TipoServicio extends AppCompatActivity {

    Button Volver1;
    Button Alineacion;
    Button Frenos;
    Button Neumaticos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_servicio);

        Volver1 = findViewById(R.id.btnVolver1);
        Alineacion = findViewById(R.id.btnAlineacion);
        Frenos = findViewById(R.id.btnFrenos);
        Neumaticos = findViewById(R.id.btnNeuma);
        Volver1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TipoServicio.this, MainActivity.class));
            }
        });
        Alineacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TipoServicio.this, Cita.class));
            }
        });
        Frenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TipoServicio.this, Cita.class));
            }
        });
        Neumaticos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TipoServicio.this, Cita.class));
            }
        });
    }
}