package com.flaviocaruso.slotmachine;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EscolhaActivity extends AppCompatActivity {

    TextView t;




    public void irTelaJogo(View view){

        Intent intent3 = new Intent(getApplicationContext(),JogoActivity.class);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.clique1);
        mp.start();
        startActivity(intent3);
    }

    public void voltarTelaMenu2(View view){

        Intent intent4 = new Intent(getApplicationContext(),MenuActivity.class);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.clique1);
        mp.start();
        startActivity(intent4);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);

        t=(TextView) findViewById(R.id.sexo);
        Typeface minhafonte=Typeface.createFromAsset(getAssets(),"fonts/PiratesBay.ttf");
        t.setTypeface(minhafonte);

        t=(TextView) findViewById(R.id.tvNome);
        Typeface minhafonte1=Typeface.createFromAsset(getAssets(),"fonts/PiratesBay.ttf");
        t.setTypeface(minhafonte1);

        t=(TextView) findViewById(R.id.fichas);
        Typeface minhafonte2=Typeface.createFromAsset(getAssets(),"fonts/PiratesBay.ttf");
        t.setTypeface(minhafonte2);
    }
}
