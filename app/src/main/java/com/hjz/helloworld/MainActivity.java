package com.hjz.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edittext;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext = (EditText)findViewById(R.id.EditText);
        button = (Button)findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("Log.D", "onClick: Button");
                edittext.setText("This Button");
            }
        });
    }
}
