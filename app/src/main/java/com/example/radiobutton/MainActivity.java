package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
RadioButton radioButton1,radioButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButton1=findViewById(R.id.radioButton1);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton1.setOnCheckedChangeListener(this);
        radioButton2.setOnCheckedChangeListener( this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.radioButton1:
                if (compoundButton.isChecked())
                Toast.makeText(this, "1  "+radioButton1.getText(), Toast.LENGTH_SHORT).show();
                break;
            case  R.id.radioButton2:
                if (compoundButton.isChecked())
                Toast.makeText(this, "2  "+radioButton2.getText(), Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
