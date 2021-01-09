package informatico.to.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*Declaraos una varianble de la clase Listview*/
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Activamos el icono del action bar*/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        /*Hacemos el llamado a la imagen especifico*/
        getSupportActionBar().setIcon(R.drawable.ic_action_name);
        /*instanciamos la variable local con el id del control Listview del Layout*/
        lista=(ListView)findViewById(R.id.ListView);
        //creamos el Areglo de Strings (opciones)
            String[] Opc = {"opcion 1", "opcion 2", "opcion 3", "opcion 4"};
        /*creamos un objeto de arrayadapter para crear la vista*/
            ArrayAdapter<String> Arrays;
        /*cargamos el arreglos de strings a la vista */
            Arrays = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Opc);
        /*indicamos que se cargue la lista al control del xml*/
            lista.setAdapter(Arrays);

        //metodo para que muestre un toast cada vez que hacemos clic en una opcion
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override public void onItemClick
                    (AdapterView<?> parent, View view, int position, long id){
            /*capturamos la posicion de la lista*/
                String opcSelecion=(String)lista.getAdapter().getItem(position);
                /*mostramos cuando hacemos clic en la lista segun su posicion*/
                Toast.makeText(getApplication(),opcSelecion,Toast.LENGTH_SHORT).show();
            }});}}