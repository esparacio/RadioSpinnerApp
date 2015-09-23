package edu.elon.radiospinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClick(View view){

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()){
            case R.id.circle:
                if(checked)
//stuff here about circle//
                    break;
            case R.id.square:
                if(checked)
//stuff here about square//
                    break;
        }

    }

}