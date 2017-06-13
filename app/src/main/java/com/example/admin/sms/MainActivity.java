package com.example.admin.sms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View bouton = findViewById(R.id.button);

        bouton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                EditText numero = (EditText) findViewById(R.id.number);
                EditText text = (EditText) findViewById(R.id.text);


                String uri = "smsto:"+numero.getText().toString();
                Intent intent = new Intent(android.content.Intent.ACTION_SENDTO, Uri.parse(uri));
                intent.putExtra("sms_body", text.getText().toString());
                startActivity(intent);
            }
        });
    }
}
