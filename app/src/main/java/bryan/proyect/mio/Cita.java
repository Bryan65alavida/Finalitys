package bryan.proyect.mio;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class Cita extends AppCompatActivity {

    Button Pcita;
    Button Pcotiza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cita);

        Pcita = findViewById(R.id.BtnCita);
        Pcotiza = findViewById(R.id.BtnCotiza);

        Pcotiza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cita.this, Cotizar.class));
            }
        });
        Pcita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(Cita.this, CitaPedida.class));
            }
        });

    }
}