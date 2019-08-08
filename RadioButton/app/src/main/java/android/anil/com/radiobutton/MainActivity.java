package android.anil.com.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    Button genderbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup)findViewById(R.id.helloradio);
        genderbtn=(Button)findViewById(R.id.button);
        genderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=rg.getCheckedRadioButtonId();
                rb=(RadioButton)findViewById(id);
                String s1=rb.getText().toString();
                Toast.makeText(getApplicationContext(),"Gender is : "+s1,5000).show();
            }
        });
    }
}