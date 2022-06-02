package sg.edu.rp.c346.id21018545.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Spinner spnYesNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnYesNo = findViewById(R.id.spinner);
        tv = findViewById(R.id.textView);


        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View View, int position, long id){
                switch(position){
                    case 0:
                        tv.setText("Spinner Item, Yes selected");
                        break;
                    case 1:
                        tv.setText("Spinner item, No selected");
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){
            }
        });

    }
}