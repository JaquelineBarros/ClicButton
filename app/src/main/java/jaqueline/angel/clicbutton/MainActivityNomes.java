package jaqueline.angel.clicbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Alunos on 04/04/2018.
 */

public class MainActivityNomes extends AppCompatActivity {

    ListView lv;
    String[] nomes = {"João", "Maria", "José", "Raimundo", "Floriano", "Julesca", "Suzane", "Janiele",
            "Carleane", "Eliane", "Raphael", "Marcelo", "Julio", "Gerold", "Arnold", "Marcio", "Aline",
            "Jaqueline", "Antonia", "Joana", "Marcos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainnomes);

        lv = (ListView) findViewById(R.id.list_nomes);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, nomes);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(),
                        "Item clicado: " + i, Toast.LENGTH_SHORT).show();
            }
        });

    }
}