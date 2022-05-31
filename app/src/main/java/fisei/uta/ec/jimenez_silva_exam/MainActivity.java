package fisei.uta.ec.jimenez_silva_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button buttonSiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSiguiente= findViewById(R.id.buttonSiguiente1);
        
    }
    public void onClickSiguiente(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2J_S.class);
        startActivity(intent);
    }

}