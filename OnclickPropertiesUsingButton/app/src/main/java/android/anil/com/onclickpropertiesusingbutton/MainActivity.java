package android.anil.com.onclickpropertiesusingbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //call method name
    public void show(View v) {
        Toast.makeText(getApplicationContext(), "My Button isWorking", 5000).show();
    }
}
