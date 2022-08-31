package com.example.recipeappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class BuyMeACoffee extends AppCompatActivity {

    TextView paypal, paytm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_me_acoffee);

        paypal=findViewById(R.id.textView27);
        paypal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://paypal.me/AhaanShaikh");
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        paytm=findViewById(R.id.textView28);
        paytm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard=(ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData upi=ClipData.newPlainText("TextView", paytm.getText().toString());
                clipboard.setPrimaryClip(upi);

                Toast.makeText(BuyMeACoffee.this, "UPI ID Copied.", Toast.LENGTH_SHORT).show();
            }
        });


    }
}