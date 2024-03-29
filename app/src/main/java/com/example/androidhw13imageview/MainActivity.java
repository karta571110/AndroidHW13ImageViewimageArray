package com.example.androidhw13imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    float imagenum;
    int transint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] image = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven, R.drawable.eight, R.drawable.nine, R.drawable.ten};
        final ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        Button ch = (Button) findViewById(R.id.change);
        final EditText ignum = (EditText) findViewById(R.id.num);

        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!("".equals(ignum.getText().toString()))  ) {
                    imagenum = Float.parseFloat(ignum.getEditableText().toString());
                    transint= (int)imagenum;
                    if(imagenum-transint ==0) {
                        imageView.setImageResource(image[transint - 1]);
                    }
                    }
                 if(imagenum>10 ||imagenum<1){
                    Toast back=Toast.makeText(MainActivity.this,"沒有這個圖片!",Toast.LENGTH_SHORT);
                    back.show();
                }
                else if(ignum.getText().toString().contains(".")){
                    Toast back=Toast.makeText(MainActivity.this,"只能輸入整數!",Toast.LENGTH_SHORT);
                    back.show();
                }
            }
        });
    }
}
