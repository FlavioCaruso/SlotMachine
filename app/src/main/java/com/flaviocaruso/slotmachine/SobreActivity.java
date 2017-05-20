package com.flaviocaruso.slotmachine;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SobreActivity extends AppCompatActivity {

    TextView t;

    public void voltarTelaMenu(View view){

        Intent intent3 = new Intent(getApplicationContext(),MenuActivity.class);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.clique1);
        mp.start();
        startActivity(intent3);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        t=(TextView) findViewById(R.id.slot);
        Typeface minhafonte5=Typeface.createFromAsset(getAssets(),"fonts/PiratesBay.ttf");
        t.setTypeface(minhafonte5);

        t=(TextView) findViewById(R.id.versao);
        Typeface minhafonte6=Typeface.createFromAsset(getAssets(),"fonts/PiratesBay.ttf");
        t.setTypeface(minhafonte6);

        t=(TextView) findViewById(R.id.ver);
        Typeface minhafonte7=Typeface.createFromAsset(getAssets(),"fonts/PiratesBay.ttf");
        t.setTypeface(minhafonte7);

        t=(TextView) findViewById(R.id.nome);
        Typeface minhafonte8=Typeface.createFromAsset(getAssets(),"fonts/PiratesBay.ttf");
        t.setTypeface(minhafonte8);

    }
}
