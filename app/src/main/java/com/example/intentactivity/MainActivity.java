package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "MainActivity.extra.MESSAGE";
    private EditText messageEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageEdit = findViewById(R.id.editText_Mensaje);
        Intent intent = getIntent();
        String reply = intent.getStringExtra(SecondActivity.EXTRA_REPLY);
        TextView tv = findViewById(R.id.textView_Replica);
        tv.setText(reply);
    }

    public void SecondActivity(View view){
        Intent intent = new Intent( this, SecondActivity.class);
        String message = messageEdit.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
