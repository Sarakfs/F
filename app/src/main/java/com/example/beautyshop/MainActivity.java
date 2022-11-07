package com.example.beautyshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button wor = findViewById(R.id.work);
        wor.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                Toast.makeText(MainActivity.this, "The work starts every day from Sunday to Thursday at 8:30 in the morning until 1:30 in the afternoon.\n" +
                        " From five in the evening until eight in the evening.\n" +
                        " On Saturdays, work is from nine in the morning until two in the afternoon", Toast.LENGTH_LONG).show();

                return false;
            }
        });

        Button work = findViewById(R.id.work);
        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Long click", Toast.LENGTH_SHORT).show();
            }
        });




        Button Bcal = findViewById(R.id.call);
        Bcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("tel:96650038668"));
                startActivity(intent);

            }
        });

    }


    public void go(View view) {
        Intent intent = new Intent(MainActivity.this,activity_1.class);
        startActivity(intent);

    }
    public void go2(View view) {
        Intent intent = new Intent(MainActivity.this, activity_proudect.class);
        startActivity(intent);
    }
}