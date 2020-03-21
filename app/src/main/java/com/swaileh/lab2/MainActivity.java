package com.swaileh.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout firstLinearLayout = new LinearLayout(this);
        Button addBt = new Button(this);
        LinearLayout secondLinearLayout = new LinearLayout(this);

        ScrollView scrollView = new ScrollView(this);

        firstLinearLayout.setOrientation(LinearLayout.VERTICAL);
        secondLinearLayout.setOrientation(LinearLayout.VERTICAL);

        addBt.setText("Add Customer");

        addBt.setLayoutParams( new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,    //width
                ViewGroup.LayoutParams.WRAP_CONTENT     //height
        ));

        firstLinearLayout.addView(addBt);

        scrollView.addView(secondLinearLayout);

        firstLinearLayout.addView(scrollView);

        setContentView(firstLinearLayout);


        addBt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AddCustomerActivity.class);
                MainActivity.this.startActivity(intent);
                finish();
            }
        });


        for(Customer objCustomer : Customer.customers) {
            TextView txtCustomerInfo = new TextView(this) ;
            txtCustomerInfo.setTextAppearance(R.style.TextAppearance_AppCompat_Display2);
            txtCustomerInfo.setText(objCustomer.toString());
            secondLinearLayout .addView(txtCustomerInfo);
        }



    }
}
