package com.example.android.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartisshowing=true;

    public void fade(View view){
        ImageView bartimageView=(ImageView) findViewById(R.id.imageView);
        ImageView homerimageView=(ImageView) findViewById(R.id.homerimageView);

        if(bartisshowing){
            bartisshowing=false;
            bartimageView.animate().alpha(0).setDuration(2000);
            homerimageView.animate().alpha(1).setDuration(2000);
        }else{
            bartisshowing=true;
            bartimageView.animate().alpha(1).setDuration(2000);
            homerimageView.animate().alpha(0).setDuration(2000);
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}