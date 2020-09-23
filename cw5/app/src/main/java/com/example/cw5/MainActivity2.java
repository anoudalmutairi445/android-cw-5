package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView name = findViewById(R.id.textView2);
        TextView age = findViewById(R.id.textView3);

         Bundle air = getIntent().getExtras();
         String myL = air.getString("info");
         String myb = air.getString("age");

         name.setText(myL);
         age.setText(myb);

        Button c = findViewById(R.id.goback);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent( MainActivity2.this , MainActivity.class);
                startActivity(v);

            }
        });



    }
}