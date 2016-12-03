package vera.moon.com.c1_listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ListView lista;
    public ArrayList<String> family = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Llamamos a la variable lista
        lista = (ListView)findViewById(R.id.listView);

        //creamos AraryList com elementos
        family.add("Timers");
        family.add("aang");
        family.add("soka");
        family.add("appa");

        //Creamos arrayadpater (this,android.R.layout,simple_list_item_1,arraylist);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,family);

        //setadapter
        lista.setAdapter(adapter);

        //setOnItemClickListener
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //AdapterView (spinner,listtview,etc)
                //View => row
                //position y long son el mismo

                //Con esta lnea desparecemos la lista
                //adapterView.setVisibility(View.GONE);

                Toast.makeText(getApplicationContext(),"Name: "+family.get(i),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
