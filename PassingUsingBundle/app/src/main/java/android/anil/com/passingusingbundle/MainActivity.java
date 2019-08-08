package android.anil.com.passingusingbundle;

import android.anil.com.passingusingbundle.R;
import android.anil.com.passingusingbundle.ReceivingActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button sendbtn;
    EditText uname, uloc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendbtn = (Button) findViewById(R.id.button);
        uname = (EditText) findViewById(R.id.editText);
        uloc = (EditText) findViewById(R.id.editText2);
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = uname.getText().toString();
                String s2 = uloc.getText().toString();
                //create Bundle class
                Bundle bundle = new Bundle();
                //Sending the data from bundle
                bundle.putString("name", s1);
                bundle.putString("loc", s2);
                Intent intent = new Intent(MainActivity.this, ReceivingActivity.class);
                //Storing the bundle objects into intent
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}