package xyz.hewkawar.bankh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Objects;

public class Scheme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        Intent uri = getIntent();

        if (uri != null && uri.getData() != null) {
            String action = uri.getAction();
            Uri data = uri.getData();
            // Do something with the path...

            Toast.makeText(this, data.getQueryParameter("token").toString(), Toast.LENGTH_SHORT).show();

        }



        finish();
    }
}