package fisei.uta.ec.jimenez_silva_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
private Button buttonSiguiente;
private ListView ListViewCargarDatos;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSiguiente= findViewById(R.id.buttonSiguiente1);
        ListViewCargarDatos=findViewById(R.id.ListViewDatos);
        Bundle bundle = getIntent().getExtras();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1 );
        if(bundle!=null){
            int [] nuevov= bundle.getIntArray("valores");
            for (int i = 0 ; i<4; i++){
                adapter.add(String.valueOf(nuevov[i]));
            }

           ListViewCargarDatos.setAdapter(adapter);
        }
    }
    public void onClickSiguiente(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2J_S.class);
        startActivity(intent);
    }
    

}