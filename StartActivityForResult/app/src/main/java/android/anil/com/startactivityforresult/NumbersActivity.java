package android.anil.com.startactivityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class NumbersActivity extends AppCompatActivity {

    RadioGroup rg2;

    RadioButton rb2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        rg2=(RadioGroup)findViewById(R.id.radiogroup2);
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id = rg2.getCheckedRadioButtonId();
                rb2 = (RadioButton) findViewById(id);
                String num = rb2.getText().toString();
                Intent in1 = new Intent();
                in1.putExtra("num1", num);
                setResult(RESULT_OK, in1);
                finish();
            }
        });

    }

}
