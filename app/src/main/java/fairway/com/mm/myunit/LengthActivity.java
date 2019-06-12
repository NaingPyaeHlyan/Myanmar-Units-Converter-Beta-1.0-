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

public class LengthActivity extends AppCompatActivity {

    Spinner spinnerInput, spinnerOutput;
    EditText etInput, etOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        setTitle("Units converter - Length");

        spinnerInput = (Spinner) findViewById(R.id.spinnerLengthIn);
        spinnerOutput = (Spinner) findViewById(R.id.spinnerLengthOut);

        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this,
                R.array.length_array, android.R.layout.simple_spinner_item);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerInput.setAdapter(arrayAdapter);
        spinnerOutput.setAdapter(arrayAdapter);

        spinnerInput.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (etInput.getText().length() > 0) {
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
                    convert(Double.parseDouble(etInput.getText().toString()), position, spinnerInput.getSelectedItemPosition());

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //-----------------------------------------------------------------------------------------------------------
        //-------- Convert Edit Text---------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------

        etInput = (EditText) findViewById(R.id.editTextLengthIn);

        etInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    convert(Double.parseDouble(s.toString()), spinnerInput.getSelectedItemPosition(), spinnerOutput.getSelectedItemPosition());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
//-----------------------------------------------------------------------------------------------------------

    private void convert(double value, int pos1, int pos2){

        CalcLength calcLength = new CalcLength();
        etOutput = (EditText)findViewById(R.id.editTextLengthOut);

        switch(pos1){
            case 0:
                calcLength.setSanchi(value);
                break;
            case 1:
                calcLength.setHnan(value);
                break;
            case 2:
                calcLength.setMayaw(value);
                break;
            case 3:
                calcLength.setLetthit(value);
                break;
            case 4:
                calcLength.setMaik(value);
                break;
            case 5:
                calcLength.setHtwa(value);
                break;
            case 6:
                calcLength.setTaung(value);
                break;
            case 7:
                calcLength.setLan(value);
                break;
            case 8:
                calcLength.setTa(value);
                break;
            case 9:
                calcLength.setOuthaba(value);
                break;
            case 10:
                calcLength.setKawtha(value);
                break;
            case 11:
                calcLength.setGawout(value);
                break;
            case 12:
                calcLength.setYuzana(value);
                break;
            case 13:
                calcLength.setMm(value);
                break;
            case 14:
                calcLength.setCm(value);
                break;
            case 15:
                calcLength.setM(value);
                break;
            case 16:
                calcLength.setKm(value);
                break;
            case 17:
                calcLength.setIn(value);
                break;
            case 18:
                calcLength.setFt(value);
                break;
            case 19:
                calcLength.setYard(value);
                break;
            case 20:
                calcLength.setMile(value);
                break;

                default:
                    break;
        }

        switch (pos2){
            case 0:
                etOutput.setText(calcLength.getSanchi());
                break;
            case 1:
                etOutput.setText(calcLength.getHnan());
                break;
            case 2:
                etOutput.setText(calcLength.getMayaw());
                break;
            case 3:
                etOutput.setText(calcLength.getLetthit());
                break;
            case 4:
                etOutput.setText(calcLength.getMaik());
                break;
            case 5:
                etOutput.setText(calcLength.getHtwa());
                break;
            case 6:
                etOutput.setText(calcLength.getTaung());
                break;
            case 7:
                etOutput.setText(calcLength.getLan());
                break;
            case 8:
                etOutput.setText(calcLength.getTa());
                break;
            case 9:
                etOutput.setText(calcLength.getOuthaba());
                break;
            case 10:
                etOutput.setText(calcLength.getKawtha());
                break;
            case 11:
                etOutput.setText(calcLength.getGawout());
                break;
            case 12:
                etOutput.setText(calcLength.getYuzana());
                break;
            case 13:
                etOutput.setText(calcLength.getMm());
                break;
            case 14:
                etOutput.setText(calcLength.getCm());
                break;
            case 15:
                etOutput.setText(calcLength.getM());
                break;
            case 16:
                etOutput.setText(calcLength.getKm());
                break;
            case 17:
                etOutput.setText(calcLength.getIn());
                break;
            case 18:
                etOutput.setText(calcLength.getFt());
                break;
            case 19:
                etOutput.setText(calcLength.getYard());
                break;
            case 20:
                etOutput.setText(calcLength.getMile());
                break;

                default:
                    break;
        }
    }
}
