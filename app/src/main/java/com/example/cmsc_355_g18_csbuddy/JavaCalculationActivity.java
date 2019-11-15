package com.example.cmsc_355_g18_csbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;

import java.util.Arrays;
import java.util.List;

public class JavaCalculationActivity extends Fragment {

    Spinner primitiveTypesSpinner1;
    Spinner primitiveTypesSpinner2;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_java_calculation, container, false);

        List<JavaArithmetic.DataTypes> primitveDataTypes = Arrays.asList(JavaArithmetic.DataTypes.values());

        //makes a spinner containing the values from DataTypes enum contained in JavaArithmetic
        primitiveTypesSpinner1 = root.findViewById(R.id.spinner1);
        ArrayAdapter<JavaArithmetic.DataTypes> adapter1 = new ArrayAdapter<JavaArithmetic.DataTypes>(this.getActivity(),
                android.R.layout.simple_spinner_item, primitveDataTypes);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        primitiveTypesSpinner1.setAdapter(adapter1);

        primitiveTypesSpinner2 = root.findViewById(R.id.spinner2);
        ArrayAdapter<JavaArithmetic.DataTypes> adapter2 = new ArrayAdapter<JavaArithmetic.DataTypes>(this.getActivity(),
                android.R.layout.simple_spinner_item, primitveDataTypes);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        primitiveTypesSpinner2.setAdapter(adapter2);

        return root;
    }
}
