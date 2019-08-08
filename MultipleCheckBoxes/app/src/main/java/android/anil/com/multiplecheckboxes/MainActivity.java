package android.anil.com.multiplecheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox)findViewById(R.id.checkBox);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1.isChecked()){
                    Toast.makeText(getApplicationContext(),"CheckBox1 is Checked",5000).show();
                }else{
                    Toast.makeText(getApplicationContext(),"CheckBox1 is UnChecked",5000).show();
                }
                if(c2.isChecked()){
                    Toast.makeText(getApplicationContext(),"CheckBox2 is Checked",5000).show();
                }else{
                    Toast.makeText(getApplicationContext(),"CheckBox2 is UnChecked",5000).show();
                }
                if(c3.isChecked()){
                    Toast.makeText(getApplicationContext(),"CheckBox3 is Checked",5000).show();
                }else{
                    Toast.makeText(getApplicationContext(),"CheckBox3 is UnChecked",5000).show();
                }
            }
        });
    }
}
