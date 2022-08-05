package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add = findViewById(R.id.calculate);
        EditText num1 = findViewById(R.id.number1);
        EditText num2 = findViewById(R.id.number2);
        TextView xt3 = findViewById(R.id.Total);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int z = Integer.parseInt(num1.getText().toString()) ;
                int x = Integer.parseInt(num2.getText().toString());
                int c = z+x;
                xt3.setText(totalGrade(z,x) + " " );


                System.out.println("www"+c);
            }
        });




    }
    public static int totalGrade(int z, int x){
        return z + x;

    }


}