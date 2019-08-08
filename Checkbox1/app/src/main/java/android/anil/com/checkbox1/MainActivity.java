package android.anil.com.checkbox1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb=(CheckBox)findViewById(R.id.hellocheckbox);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(buttonView.isChecked()){
                    cb.setText("Checked");
                    Toast.makeText(getApplicationContext(),"Checked",5000).show();
                }else{
                    cb.setText("UnChecked");
                    Toast.makeText(getApplicationContext(),"UnChecked",5000).show();
                }
            }
        });
    }
}