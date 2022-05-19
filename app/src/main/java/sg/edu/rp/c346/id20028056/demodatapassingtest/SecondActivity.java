package sg.edu.rp.c346.id20028056.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer=findViewById(R.id.tvAnswer);
        Intent intent=getIntent();
        Character valueChar=intent.getCharExtra("value",'?');
        int value=intent.getIntExtra("value",0);

        if(value>0 | value<0) {
            tvAnswer.setText("Integer value received is: "+value);
        }
        else
        {

            tvAnswer.setText("Character value received is: "+valueChar);
        }


    }
}