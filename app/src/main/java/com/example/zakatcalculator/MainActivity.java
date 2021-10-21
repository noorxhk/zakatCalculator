package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {


    EditText cash , loan , gold , silver , bor , tax;
    Button btn;
    TextView res;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cash = (EditText)findViewById(R.id.inHandCash);
        loan = (EditText)findViewById(R.id.loans);
        gold = (EditText)findViewById(R.id.gold);
        silver = (EditText)findViewById(R.id.silver);
        bor = (EditText)findViewById(R.id.borrowMoney);
        tax = (EditText)findViewById(R.id.taxes);
        btn = (Button) findViewById(R.id.button);
        res = (TextView) findViewById(R.id.textView);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (calc()
//                {
//
//                }
//
//
//                res.setText(String.valueOf(zakat));
//            }
//        });






    }

    public void calc(View view) {
        try {
            String cashVal = cash.getText().toString();
            String loanVal = loan.getText().toString();
            String goldVal = gold.getText().toString();
            String silverVal = silver.getText().toString();
            String borVal = bor.getText().toString();
            String taxVal = tax.getText().toString();
            int sum;
            sum = Integer.parseInt(cashVal) + Integer.parseInt(loanVal) + Integer.parseInt(goldVal) +
                    Integer.parseInt(silverVal) - Integer.parseInt(borVal) - Integer.parseInt(taxVal);


            double zakat = (sum * 2.5) / 100;
            res.setText(String.valueOf(zakat));
        }
        catch (Exception e){
            res.setText("Enter Values in all Fields");

        }

    }
}