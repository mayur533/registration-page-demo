package com.example.regpagedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void regster(View view) {
        EditText fn=findViewById(R.id.fn);
        EditText mn=findViewById(R.id.mn);
        EditText ln=findViewById(R.id.ln);
        EditText bd=findViewById(R.id.bd);
        EditText addr=findViewById(R.id.addr);
        EditText em=findViewById(R.id.em);
        String firstname=fn.getText().toString();
        String middlename=mn.getText().toString();
        String lastname=ln.getText().toString();
        String birthd=bd.getText().toString();
        String address=addr.getText().toString();
        String email=em.getText().toString();

        if (firstname.isEmpty() & middlename.isEmpty() & lastname.isEmpty() & birthd.isEmpty() & address.isEmpty() & email.isEmpty()){
            Toast.makeText(this, "Enter Valid Data", Toast.LENGTH_SHORT).show();
        }
        else{

            Intent i=new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("fn",firstname);
            i.putExtra("mn",middlename);
            i.putExtra("ln",lastname);
            i.putExtra("bd",birthd);
            i.putExtra("addr",address);
            i.putExtra("em",email);
            startActivity(i);


        }

    }

    public void getdate(View view) {
    }
}