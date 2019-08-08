package android.anil.com.radiobutton1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup)findViewById(R.id.radiogroup1);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(id);
                String  s1=rb.getText().toString();
                Toast.makeText(getApplicationContext(),"Mobile is : "+s1,5000).show();
            }
        });
    }
}