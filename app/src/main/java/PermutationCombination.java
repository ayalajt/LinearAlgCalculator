import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

import com.example.cmsc_355_g18_csbuddy.R;

/*
/  Author: Mark Groves
/  Init Date: 10/9/19
*/

public class PermutationCombination extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compute_permutations);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton combRadioButton = (RadioButton) findViewById(R.id.combRadioButton);
        RadioButton permRadioButton = (RadioButton) findViewById(R.id.permRadioButton);
        ToggleButton repetitionToggleButton = (ToggleButton) findViewById(R.id.repetitionButton);
        EditText editText_n = (EditText) findViewById(R.id.editText3);
        EditText editText_r = (EditText) findViewById(R.id.editText4);
        Button submitButton = (Button) findViewById(R.id.submitButton);
        final TextView textView1 = (TextView) findViewById(R.id.textViewRepetition); // repetition
        final TextView textView2 = (TextView) findViewById(R.id.chooseTextView); // choose

        radioGroup.clearCheck(); // make buttons initially clear

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    // Check which radio button has been clicked
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        // Get the selected Radio Button
                        RadioButton radioButton = (RadioButton) group.findViewById(checkedId);
                    }

        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    // no button selected
                    Toast.makeText(PermutationCombination.this, "No answer has been selected", Toast.LENGTH_SHORT).show();
                }
                else {
                    RadioButton radioButton = (RadioButton) radioGroup.findViewById(selectedId);
                    Toast.makeText(PermutationCombination.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public static void main(String[] args) {
        boolean repeat;
    }

    private static int factorial(int n) {
        if(n<=1){
            return 1;
        }
        return (n * factorial(n-1));
    }

    private static int nPr(int n, int r) {
        return (factorial(n) / factorial(n - r));
    }
}
