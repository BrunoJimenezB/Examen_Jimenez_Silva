package fisei.uta.ec.jimenez_silva_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2J_S extends AppCompatActivity {
private Button buttonIngresar;
private Button  buttonCerrar;
private EditText editTextnumero;
private ListView listViewnumero;
private  ArrayAdapter<String> adapter;
private int contador;
private int [] valores;
public int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_js);
        buttonIngresar= findViewById(R.id.buttonIngreso);
        buttonCerrar= findViewById(R.id.buttonCerrar2);
        editTextnumero=findViewById(R.id.editTextIngresoNumeroj_s);
        listViewnumero= findViewById(R.id.ListViewIngresoNumeros2);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1 );
        valores= new int[4];
       // listViewnumero.setAdapter(adapter);
        //Asociar el adapter con la lista que a mostrar los datos
       // listViewnumero.setAdapter(adapter);
    }
    public void onClickIngresoNumero(View view){


        adapter.add(editTextnumero.getText().toString());
        listViewnumero.setAdapter(adapter);
        valores[i]= Integer.valueOf(editTextnumero.getText().toString());
        i=i+1;

    //    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, cargarDatosListView());

        //Asociar el adapter con la lista que a mostrar los datos

       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, cargarDatosListView());
        //Asociar el adapter con la lista que a mostrar los datos

    }
//    private List<String> cargarDatosListView(){
//        List<String> list = new ArrayList<String>();
//
//            String item = editTextnumero.getText().toString();
//            list.add(item);
//
//
//
public void onClickPasar(View view){
        Intent intent= new Intent(this, MainActivity.class);
      intent.putExtra("valores", valores);

        startActivity(intent);
}


}