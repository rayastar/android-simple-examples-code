package android.anil.com.passingdatabetweenactivitys;

import android.anil.com.passingdatabetweenactivitys.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button sendb;
    EditText name1, ph1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendb = (Button) findViewById(R.id.button);
        name1 = (EditText) findViewById(R.id.editText);
        ph1 = (EditText) findViewById(R.id.editText2);
        sendb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = name1.getText().toString();
                String s2 = ph1.getText().toString();
                //Converting String to Long
                long l1 = Long.parseLong(s2);
                Intent intent = new Intent(getApplicationContext(), RecevingActivity.class);
                //Sending the Data From Intent
                intent.putExtra("name", s1);
                intent.putExtra("ph", l1);
                startActivity(intent);
            }
        });
    }
}