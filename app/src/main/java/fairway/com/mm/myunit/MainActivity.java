package fairway.com.mm.myunit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnLength = (ImageButton)findViewById(R.id.imgBtnLength);
        ImageButton btnMass = (ImageButton)findViewById(R.id.imgBtnMass);

        btnLength.setOnClickListener(this);
        btnMass.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.imgBtnLength:
                Intent intentLength = new Intent(this,LengthActivity.class);
                startActivity(intentLength);
                break;
            case R.id.imgBtnMass:
                Intent intentMass = new Intent(this, MassActivity.class);
                startActivity(intentMass);
                break;

                default:
                    break;
        }
    }
}
