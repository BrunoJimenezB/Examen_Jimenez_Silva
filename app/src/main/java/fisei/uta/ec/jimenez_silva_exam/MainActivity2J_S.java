package fisei.uta.ec.jimenez_silva_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_js);
        buttonIngresar= findViewById(R.id.buttonIngreso);
        buttonCerrar= findViewById(R.id.buttonCerrar2);
        editTextnumero=findViewById(R.id.editTextIngresoNumeroj_s);
        listViewnumero= findViewById(R.id.ListViewIngresoNumeros2);
       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, cargarDatosListView());
       // listViewnumero.setAdapter(adapter);
        //Asociar el adapter con la lista que a mostrar los datos
       // listViewnumero.setAdapter(adapter);
    }
    public void onClickIngresoNumero(View view){
        List<String> list = new ArrayList<String>();

        String item = editTextnumero.getText().toString();
        list.add(item);
        listViewnumero.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, list));
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
//        return list;
//    }
private List<String> cargarDatosListView(){
    List<String> list = new ArrayList<String>();

        String item = editTextnumero.getText().toString();
        list.add(item);



    return list;
}

}