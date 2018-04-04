package jaqueline.angel.clicbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Alunos on 04/04/2018.
 */

public class MainActivityImagens extends AppCompatActivity {
    int [] imagens = {
            R.drawable.foto1,
            R.drawable.foto2,
            R.drawable.foto3,
            R.drawable.foto4,
            R.drawable.foto5,
            R.drawable.foto6
    };
    String[] nomes = {"Casados", "Orquideas","Mimosos", "Magali", "Betove", "Belinha"};

    String[] descricao = {"Filme", "Flor", "Todas as raças", "Pequena", "Mimado", "Charmosa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainimagens);

        ListView listView = (ListView) findViewById(R.id.list_img);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

    }
    class CustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return imagens.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override

        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textView = (TextView)view.findViewById(R.id.nome_view);
            TextView textView2 = (TextView)view.findViewById(R.id.desc_View);

            imageView.setImageResource(imagens[i]);
            textView.setText(nomes[i]);
            textView2.setText(descricao[i]);

            return view;
        }
    }
}
