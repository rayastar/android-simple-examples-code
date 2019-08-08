package android.anil.com.onclickpropertiesusingmultiplebutton;

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

    //calling the method names
    public void show1(View v) {
        Toast.makeText(getApplicationContext(), "Button1 is Working", 5000).show();
    }

    public void show2(View v) {
        Toast.makeText(getApplicationContext(), "Button2 is Working", 5000).show();
    }

    public void show3(View v) {
        Toast.makeText(getApplicationContext(), "Button3 is Working", 5000).show();
    }
}