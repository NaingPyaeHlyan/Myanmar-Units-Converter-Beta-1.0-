package fairway.com.mm.myunit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MassActivity extends AppCompatActivity {

    Spinner spinnerInput, spinnerOutput;
    EditText etInput, etOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        setTitle("Units Converter - Mass");


         spinnerInput = (Spinner)findViewById(R.id.spinnerMassIn);
         spinnerOutput = (Spinner)findViewById(R.id.spinnerMassOut);

        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this,
                R.array.mass_array,android.R.layout.simple_spinner_item);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerInput.setAdapter(arrayAdapter);
        spinnerOutput.setAdapter(arrayAdapter);

        spinnerInput.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (etInput.getText().length() > 0){
                    convert(Double.parseDouble(etInput.getText().toString()), position, spinnerOutput.getSelectedItemPosition());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerOutput.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (etInput.getText().length() > 0) {
                    convert(Double.parseDouble(etInput.getText().toString()),position, spinnerInput.getSelectedItemPosition());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //-----------------------------------------------------------------------------------------------------------
        //-------- Convert Edit Text---------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------

        etInput = (EditText)findViewById(R.id.editTextMassIn);

        etInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (s.length() > 0){
                        convert(Double.parseDouble(s.toString()),spinnerInput.getSelectedItemPosition(),spinnerOutput.getSelectedItemPosition());
                    }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    //-----------------------------------------------------------------------------------------------------------
    private void convert(double value, int pos1, int pos2) {
        CalcMass calcMass = new CalcMass();

        etOutput = (EditText)findViewById(R.id.editTextMassOut);

        switch (pos1) {
            case 0:
                calcMass.setYwaylay(value);
                break;
            case 1:
                calcMass.setYwaygyi(value);
                break;
            case 2:
                calcMass.setPetha(value);
                break;
            case 3:
                calcMass.setMutha(value);
                break;
            case 4:
                calcMass.setMattha(value);
                break;
            case 5:
                calcMass.setNgamutha(value);
                break;
            case 6:
                calcMass.setKyattha(value);
                break;
            case 7:
                calcMass.setPeittha(value);
                break;
            case 8:
                calcMass.setMg(value);
                break;
            case 9:
                calcMass.setG(value);
                break;
            case 10:
                calcMass.setKg(value);
                break;
            case 11:
                calcMass.setOz(value);
                break;
            case 12:
                calcMass.setLb(value);
                break;
            default:
                break;
        }
        switch (pos2) {
            case 0:
                etOutput.setText(calcMass.getYwaylay());
                break;
            case 1:
                etOutput.setText(calcMass.getYwaygyi());
                break;
            case 2:
                etOutput.setText(calcMass.getPeittha());
                break;
            case 3:
                etOutput.setText(calcMass.getMutha());
                break;
            case 4:
                etOutput.setText(calcMass.getMattha());
                break;
            case 5:
                etOutput.setText(calcMass.getNgamutha());
                break;
            case 6:
                etOutput.setText(calcMass.getKyattha());
                break;
            case 7:
                etOutput.setText(calcMass.getPeittha());
                break;
            case 8:
                etOutput.setText(calcMass.getMg());
                break;
            case 9:
                etOutput.setText(calcMass.getG());
                break;
            case 10:
                etOutput.setText(calcMass.getKg());
                break;
            case 11:
                etOutput.setText(calcMass.getOz());
                break;
            case 12:
                etOutput.setText(calcMass.getLb());
                break;
            default:
                break;
        }
    }
}

