package com.flaviocaruso.slotmachine;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.flaviocaruso.slotmachine.R.id.btPlay;

public class MenuActivity extends AppCompatActivity {


    public void irTelaEscolha(View view){

        Intent intent1 = new Intent(getApplicationContext(),EscolhaActivity.class);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.clique1);
        mp.start();
        startActivity(intent1);


    }



    public void irTelaSobre(View view){

        Intent intent2 = new Intent(getApplicationContext(),SobreActivity.class);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.clique1);
        mp.start();
        startActivity(intent2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

}
