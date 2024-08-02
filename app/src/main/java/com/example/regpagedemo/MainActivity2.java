package com.example.regpagedemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent i=getIntent();
        TextView one=findViewById(R.id.one);
        TextView two=findViewById(R.id.two);
        TextView three=findViewById(R.id.three);
        TextView four=findViewById(R.id.four);
        TextView five=findViewById(R.id.five);
        TextView six=findViewById(R.id.six);
        one.setText(i.getStringExtra("fn"));
        two.setText(i.getStringExtra("mn"));
        three.setText(i.getStringExtra("ln"));
        four.setText(i.getStringExtra("bd"));
        five.setText(i.getStringExtra("addr"));
        six.setText(i.getStringExtra("em"));


    }
}