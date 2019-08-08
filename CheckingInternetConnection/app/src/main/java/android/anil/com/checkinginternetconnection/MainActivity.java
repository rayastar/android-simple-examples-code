package android.anil.com.checkinginternetconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button googlebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        googlebtn=(Button)findViewById(R.id.button);
        googlebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new InternetCheckingClass(getApplicationContext()).isConnectingToInternet()){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")));

                }else {
                    Snackbar snackbar=Snackbar.make(v,"Network is Not Connected Check Your Interne tConnection",Snackbar.LENGTH_LONG);
                    snackbar.show();
                }
            }
        });
    }
}