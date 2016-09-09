package edu.orangecoastcollege.cs273.grantbyers.tipcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //asociate controller withneeed views
    private EditText amountEditText;
    private TextView amountTextView;
    private TextView totalTextView;
    private TextView tipTextView;
    private TextView percentTextView;
    private SeekBar percentSeekBar;

//associate the controller with needed model

    ResturantBill currentBill = new ResturantBill();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //connect controller with the widegets
        amountEditText = (EditText) findViewById(R.id.amountEditText);
        amountTextView = (TextView) findViewById(R.id.amountTextView);
        totalTextView= (TextView) findViewById(R.id.totalTextView);
       tipTextView = (TextView) findViewById(R.id.tipTextView);
        percentTextView = (TextView) findViewById(R.id.percentTextView);
        percentSeekBar = (SeekBar) findViewById(R.id.percentSeekBar);

        //define a listener for the amount editText onTextChange
        amountEditText.addTextChangedListener(amountTextChangeListener);


    }
    private TextWatcher amountTextChangeListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
    //do nothing
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            try{
                double amount = Double.parseDouble(charSequence.toString())/100;
                currentBill.setAmount(amount);
            }catch(NumberFormatException e)
            {
                amountEditText.setText("");
            }

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    }


