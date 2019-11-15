package com.example.cmsc_355_g18_csbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class JavaCalculationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_calculation);

        //Creates a new spinner for the primitive data type options associated with the first operand number
        Spinner primitiveType1 = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(JavaCalculationActivity.this,
                R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.dataTypes));
        arrayAdapter1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        primitiveType1.setAdapter(arrayAdapter1);

        //Creates a new spinner for the primitive data type options associated with the second operand number
        Spinner primitiveType2 = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(JavaCalculationActivity.this,
                R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.dataTypes));
        arrayAdapter2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        primitiveType2.setAdapter(arrayAdapter2);
    }
}
