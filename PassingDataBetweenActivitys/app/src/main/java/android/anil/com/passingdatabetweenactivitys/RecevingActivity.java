package android.anil.com.passingdatabetweenactivitys;

import android.anil.com.passingdatabetweenactivitys.R;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecevingActivity extends AppCompatActivity {
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receving);
        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);
        //Getting Intent
        Intent in = getIntent();
        //Receveing data from intent
        String s3 = in.getStringExtra("name");
        Long l2 = in.getLongExtra("ph", 0);
        //Convert to Long to String
        String s4 = Long.toString(l2);
        t1.setText("Name is : " + s3);
        t2.setText("PhNumber: " + s4);
    }
}