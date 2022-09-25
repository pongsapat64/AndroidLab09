package com.example.lab09;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // ประกาศตัวแปร
    private TextView tvChat;
    private EditText etInputText;
    private Button bSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ประกาศ UI
        tvChat = (TextView) findViewById(R.id.tvChat);
        etInputText = (EditText) findViewById(R.id.etInputText);
        bSend = (Button)  findViewById(R.id.bSend);
        bSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getInputTextToChat();
            }
        });
    }

    // method: showText()
    private void getInputTextToChat() {
        tvChat.setText(etInputText.getText());
        etInputText.setText("");
    }
}