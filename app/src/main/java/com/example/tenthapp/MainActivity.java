package com.example.tenthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SimpleDateFormat da=new SimpleDateFormat("yyyy-MM-dd");
        final SimpleDateFormat ti=new SimpleDateFormat("HH:mm:ss");
        Button button=(Button) findViewById(R.id.button);
        final TextView date=(TextView) findViewById(R.id.Date);
        final TextView time=(TextView) findViewById(R.id.Time);
        button.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        date.setText(da.format(new Date()));
                        time.setText(ti.format(new Date()));
                    }
                }
        );
    }
}