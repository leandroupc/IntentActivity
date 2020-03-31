package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "SecondActivity.extra.REPLY";
    private EditText messageReply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView tv = findViewById(R.id.textView_Mensaje);
        tv.setText(message);
        messageReply = findViewById(R.id.editText_Replica);

    }

    public void firstActivity(View view){
        Intent intent = new Intent(this,MainActivity.class);
        String reply = messageReply.getText().toString();
        intent.putExtra(EXTRA_REPLY, reply);
        startActivity(intent);
    }
}
