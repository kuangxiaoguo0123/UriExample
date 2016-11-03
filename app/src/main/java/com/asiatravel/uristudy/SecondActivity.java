package com.asiatravel.uristudy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView) findViewById(R.id.text);

        getDataFromTopPage();
    }

    private void getDataFromTopPage() {
        Intent intent = getIntent();
        Uri dataUri = intent.getData();
        if (dataUri != null) {
            String str = dataUri.getQueryParameter("action");
            textView.setText(str);
        }
    }
}
