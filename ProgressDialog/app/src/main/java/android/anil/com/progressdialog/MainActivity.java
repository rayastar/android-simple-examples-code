package android.anil.com.progressdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button pdbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pdbtn=(Button)findViewById(R.id.button);
        pdbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog pd=new ProgressDialog(MainActivity.this);
                pd.setTitle("Downloading");
                pd.setIcon(R.mipmap.ic_launcher);
                pd.setMessage("please wait loading");
                pd.show();
            }
        });
    }
}
