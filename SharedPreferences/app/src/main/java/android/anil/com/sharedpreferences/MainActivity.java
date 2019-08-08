package android.anil.com.sharedpreferences;

import android.anil.com.sharedpreferences.R;
import android.anil.com.sharedpreferences.ReceivingActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button savebtn, showbtn;
    EditText uname, uloc, uemail;
    String name1, loc1, email1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = (EditText) findViewById(R.id.editText);
        uloc = (EditText) findViewById(R.id.editText2);
        uemail = (EditText) findViewById(R.id.editText3);
        savebtn = (Button) findViewById(R.id.button);
        showbtn = (Button) findViewById(R.id.button2);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name1 = uname.getText().toString();
                loc1 = uloc.getText().toString();
                email1 = uemail.getText().toString();
                SharedPreferences sp = getSharedPreferences("pref", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                //Storing the data from sharedpreferences
                editor.putString("name", name1);
                editor.putString("loc", loc1);
                editor.putString("email", email1);
                editor.commit();
                Toast.makeText(MainActivity.this, "Values are saved", Toast.LENGTH_SHORT).show();
            }
        });
        showbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ReceivingActivity.class));
            }
        });
    }
}