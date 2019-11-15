package com.example.cmsc_355_g18_csbuddy;

import android.os.Bundle;
import android.widget.AdapterView;
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

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class JavaCalculationActivity extends Fragment {

    Spinner primitiveTypesSpinner1;
    Spinner primitiveTypesSpinner2;

    JavaArithmetic.DataTypes t1;
    JavaArithmetic.DataTypes t2;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_java_calculation, container, false);

        List<JavaArithmetic.DataTypes> primitveDataTypes = Arrays.asList(JavaArithmetic.DataTypes.values());
        ArrayList<String> primitiveDataTypeStrings = new ArrayList<String>();
        for (JavaArithmetic.DataTypes t: primitveDataTypes) {
            primitiveDataTypeStrings.add(t.toString());
        }

        primitiveTypesSpinner1 = root.findViewById(R.id.spinner1);
        ArrayAdapter<JavaArithmetic.DataTypes> adapter1 = new ArrayAdapter<JavaArithmetic.DataTypes>(this.getActivity(),
                android.R.layout.simple_spinner_item, primitveDataTypes);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        primitiveTypesSpinner1.setAdapter(adapter1);
        primitiveTypesSpinner1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                t1 = (JavaArithmetic.DataTypes)adapterView.getItemAtPosition(i);
            }
        });

        primitiveTypesSpinner2 = root.findViewById(R.id.spinner2);
        ArrayAdapter<JavaArithmetic.DataTypes> adapter2 = new ArrayAdapter<JavaArithmetic.DataTypes>(this.getActivity(),
                android.R.layout.simple_spinner_item, primitveDataTypes);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        primitiveTypesSpinner2.setAdapter(adapter2);
        primitiveTypesSpinner2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                t2 = (JavaArithmetic.DataTypes)adapterView.getItemAtPosition(i);
            }
        });

        return root;
    }
}
