package com.example.recipeappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BuyMeACoffee extends AppCompatActivity {

    TextView paypal, paytm;
    Button dono;
    EditText amt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_me_acoffee);

        amt=findViewById(R.id.editTextTextPersonName2);
        dono=findViewById(R.id.button2);
        dono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int amount=Integer.parseInt(String.valueOf(amt.getText()));
                Toast.makeText(BuyMeACoffee.this, "Amount payed: "+amount, Toast.LENGTH_SHORT).show();
                //paymentUsingGooglePay();
            }
        });

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

    /*
    private void paymentUsingGooglePay(){
        Uri uri=Uri.parse("upi://pay").buildUpon()
                .appendQueryParameter("pa", "7038825627@paytm")
                .appendQueryParameter("pn", "Ahaan Shaikh")
                .appendQueryParameter("tn", "test payment")
                .appendQueryParameter("am", "1")
                .appendQueryParameter("cu", "INR")
                .build();
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(uri);
        try{
            startActivityForResult(intent, 101);

        }
        catch (Exception e){
            Toast.makeText(this, "GPay app not installed", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
    */

}