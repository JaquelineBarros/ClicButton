package jaqueline.angel.clicbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.but1);

        btn2 = (Button) findViewById(R.id.but2);

        btn3 = (Button) findViewById(R.id.but3);


    }

    public void btnClickAct1(View v){

        Intent i = new Intent(MainActivity.this, MainActivityNomes.class);
        startActivity(i);

    }
    public void btnClickAct2(View v){
        Intent i = new Intent(MainActivity.this, MainActivityInteiros.class);
        startActivity(i);

    }
    public void btnClickAct3(View v){
        Intent i = new Intent(MainActivity.this, MainActivityImagens.class);
        startActivity(i);

    }
}
