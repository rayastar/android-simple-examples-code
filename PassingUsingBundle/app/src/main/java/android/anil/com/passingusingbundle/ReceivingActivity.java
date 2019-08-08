package android.anil.com.passingusingbundle;

import android.anil.com.passingusingbundle.R;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceivingActivity extends AppCompatActivity {
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiving);
        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);
        //Getting Intent
        Intent in = getIntent();
        //Getting Bundle
        Bundle b1 = in.getExtras();
        //Receivng the data from bundle
        String s3 = b1.getString("name");
        String s4 = b1.getString("loc");
        t1.setText(s3);
        t2.setText(s4);

    }
}