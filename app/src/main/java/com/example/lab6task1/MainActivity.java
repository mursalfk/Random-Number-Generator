package com.example.lab6task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView tRandNum,num1,num2,num3,num4,num5;
    EditText etLower;
    public int count=-1;
    EditText etUpper;
    int[] arr1 = new int[] {0, 0, 0,0 ,0 ,0};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tRandNum = (TextView) findViewById(R.id.tRand);
        num1 = (TextView)findViewById(R.id.num1);
        num2 = (TextView)findViewById(R.id.num2);
        num3 = (TextView)findViewById(R.id.num3);
        num4 = (TextView)findViewById(R.id.num4);
        num5 = (TextView)findViewById(R.id.num5);
        etLower = (EditText) findViewById(R.id.etLower);
        etUpper = (EditText) findViewById(R.id.etHigher);
        if(count==-1){
            for(int i=0;i<5;i++){
                arr1[i]=0;
            }
        }

        }
    public void OnRand(View v){
        if(count==4){
            count=-1;
        }
        int max = Integer.parseInt(etUpper.getText().toString());
        int min = Integer.parseInt(etLower.getText().toString());
        // Obtain a number between [0 - 49].
        Random RandInt = new Random();
        int random = RandInt.nextInt((max-min)+min);
        tRandNum.setText(String.valueOf(random));
        count++;
        inflateArray();
        setLastNumbers();
    }
    public void inflateArray(){
        arr1[count]=Integer.parseInt(tRandNum.getText().toString());
    }
    public void setLastNumbers(){
        num1.setText(String.valueOf(arr1[4]));
        num2.setText(String.valueOf(arr1[3]));
        num3.setText(String.valueOf(arr1[2]));
        num4.setText(String.valueOf(arr1[1]));
        num5.setText(String.valueOf(arr1[0]));
    }
}
