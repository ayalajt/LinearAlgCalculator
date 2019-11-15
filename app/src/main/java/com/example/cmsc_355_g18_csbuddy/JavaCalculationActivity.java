package com.example.cmsc_355_g18_csbuddy;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;

public class JavaCalculationActivity extends Fragment {

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_java_calculation, container, false);

        //Creates a new spinner for the primitive data type options associated with the first operand number
        Spinner primitiveType1 = (Spinner)root.findViewById(R.id.spinner1);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(getContext(),
                R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.dataTypes));
        arrayAdapter1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        primitiveType1.setAdapter(arrayAdapter1);

        //Creates a new spinner for the primitive data type options associated with the second operand number
        Spinner primitiveType2 = (Spinner)root.findViewById(R.id.spinner2);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(getContext(),
                R.layout.support_simple_spinner_dropdown_item, getResources().getStringArray(R.array.dataTypes));
        arrayAdapter2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        primitiveType2.setAdapter(arrayAdapter2);


        return root;
    }
}
