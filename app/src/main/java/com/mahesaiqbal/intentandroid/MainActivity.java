package com.mahesaiqbal.intentandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnMoveActivity;
    private Button btnMoveActivityWithData;
    private Button btnMoveMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveActivity = new Intent(MainActivity.this, AnotherActivity.class);
                startActivity(moveActivity);
            }
        });

        btnMoveActivityWithData = findViewById(R.id.btn_move_activity_with_data);
        btnMoveActivityWithData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveActivityWithData = new Intent(MainActivity.this, WithDataActivity.class);
                moveActivityWithData.putExtra("your_name", "Mahesa Iqbal");
                moveActivityWithData.putExtra("your_age", 20);
                startActivity(moveActivityWithData);
            }
        });

        btnMoveMaps = findViewById(R.id.btn_move_map);
        btnMoveMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String address = "Nutrifood Inspiring Center";

                Intent map = new Intent(Intent.ACTION_VIEW);
                map.setData(Uri.parse("https://maps.google.co.id/maps?q=" + address));
                startActivity(map);
            }
        });
    }
}
