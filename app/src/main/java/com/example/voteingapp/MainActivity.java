package com.example.voteingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2,fr;
    int c1 = 0, c2 = 0, i;
    TextView nov1,nov2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        nov1=findViewById(R.id.noofvote1);
        nov2=findViewById(R.id.noofvote2);
        result=findViewById(R.id.result);
        fr=findViewById(R.id.finalresult);
        for (i = 0; i < 10000; i++) {
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c1++;
                    nov1.setText(("No. of Vote = "+c1).toString());
                    if(c1>c2)
                        result.setText("Kaleen Bhaiya is Winning");
                    else if(c1==c2)
                        result.setText("Both are Equal");
                    else
                        result.setText("Ganesh Gaitonde is Winning");
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c2++;
                    nov2.setText("No. of Vote = "+c2);
                    if(c1>c2)
                        result.setText("Kaleen Bhaiya is Winning");
                    else if(c1==c2)
                        result.setText("Both are Equal");
                    else
                        result.setText("Ganesh Gaitonde is Winning");
                }
            });
            fr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(c1>c2)
                        result.setText("Kaleen Bhaiya is Winner");
                    else if(c1==c2)
                        result.setText("Tie");
                    else
                        result.setText("Ganesh Gaitonde is Winner");

                }
            });

        }
    }
}
