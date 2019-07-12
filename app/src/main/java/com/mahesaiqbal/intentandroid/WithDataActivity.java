package com.mahesaiqbal.intentandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WithDataActivity extends AppCompatActivity {

    private TextView tvGetName;
    private TextView tvGetAge;

    String yourName;
    int yourAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_data);

        yourName = getIntent().getStringExtra("your_name");
        yourAge = getIntent().getIntExtra("your_age", 0);

        tvGetName = findViewById(R.id.tv_get_name);
        tvGetAge = findViewById(R.id.tv_get_age);

        tvGetName.setText(yourName);
        tvGetAge.setText(String.valueOf(yourAge));
    }
}
