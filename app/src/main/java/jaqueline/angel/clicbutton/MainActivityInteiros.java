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

public class MainActivityInteiros extends AppCompatActivity {
    ListView lvi;
    Integer[] inteiros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maininteiros);

        lvi = (ListView) findViewById(R.id.list_inteiros);

        ArrayAdapter<Integer> adapter =
                new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, inteiros);

        lvi.setAdapter(adapter);

        lvi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(),
                        "Item clicado: " + i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}