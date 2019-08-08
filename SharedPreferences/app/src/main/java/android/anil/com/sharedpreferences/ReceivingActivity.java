package android.anil.com.sharedpreferences;

import android.anil.com.sharedpreferences.R;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceivingActivity extends AppCompatActivity {
    TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiving);
        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        SharedPreferences sp = getSharedPreferences("pref", MODE_PRIVATE);
        //Retriving the data from sharedprefrences
        String s1 = sp.getString("name", null);
        String s2 = sp.getString("loc", null);
        String s3 = sp.getString("email", null);
        t1.setText(s1);
        t2.setText(s2);
        t3.setText(s3);
    }
}