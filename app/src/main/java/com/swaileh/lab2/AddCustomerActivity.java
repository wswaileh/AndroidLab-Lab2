package com.swaileh.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;

public class AddCustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);


        String[] options = {"Male", "Female"};
        final Spinner genderSpinner = (Spinner) findViewById(R.id.gender_spinner);
        ArrayAdapter<String> objGenderArr = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, options);
        genderSpinner.setAdapter(objGenderArr);


        final EditText idEditText = (EditText) findViewById(R.id.id_et);
        final EditText nameEditText = (EditText) findViewById(R.id.name_et);
        final EditText phoneEditText = (EditText) findViewById(R.id.phone_et);

        final Button addCustomerBt = findViewById(R.id.add_customer_bt);

        addCustomerBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Customer newCustomer =new Customer();
                if (idEditText.getText().toString().isEmpty()) newCustomer.setmCustomerID(0);
                else newCustomer.setmCustomerID(Long.parseLong(idEditText.getText().toString()));
                if (nameEditText.getText().toString().isEmpty()) newCustomer.setmName("No Name");
                else newCustomer.setmName(nameEditText.getText().toString());
                if (phoneEditText.getText().toString().isEmpty()) newCustomer.setMphone("No Phone");
                else newCustomer.setMphone(phoneEditText.getText().toString());
                newCustomer.setmGender(genderSpinner.getSelectedItem().toString());
                Customer.customers.add(newCustomer);
                Intent intent = new Intent(AddCustomerActivity.this, MainActivity.class);
                AddCustomerActivity.this.startActivity(intent);
                for (Customer customer:Customer.customers)
                    Log.e( "s",customer.toString() );
                finish();
            }
        });

    }
}
