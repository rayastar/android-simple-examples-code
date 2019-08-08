package android.anil.com.startactivityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button namesbtn, numbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        namesbtn = (Button) findViewById(R.id.button);
        numbtn = (Button) findViewById(R.id.button2);
        namesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NamesActivity.class);
                startActivityForResult(intent, 1);
            }
        });
        numbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), NumbersActivity.class);
                startActivityForResult(intent1, 2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String res1 = data.getStringExtra("name1");
                namesbtn.setText(res1);
            }
        } else if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                String res2 = data.getStringExtra("num1");
                numbtn.setText(res2);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}