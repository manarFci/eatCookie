package com.example.android.forinheritance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
          ImageView eatCookie= (ImageView) findViewById(R.id.android_cookie_image_view);
        TextView txtCookie=(TextView) findViewById(R.id.status_text_view);
        eatCookie.setImageResource(R.drawable.after_cookie);
        txtCookie.setText("I'm Full..");


        // TODO: Find a reference to the TextView in the layout. Change the text.

    }
}
