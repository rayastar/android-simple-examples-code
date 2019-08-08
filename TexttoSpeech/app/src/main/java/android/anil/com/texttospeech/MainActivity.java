package android.anil.com.texttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button speakbtn;
    EditText name;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        textToSpeech=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                Toast.makeText(MainActivity.this, "Text to Speech engine is intialized", Toast.LENGTH_SHORT).show();
            }
        });
        speakbtn=(Button)findViewById(R.id.button);
        name=(EditText)findViewById(R.id.editText);
        speakbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=name.getText().toString();
                textToSpeech.speak(s1,RESULT_OK,null);
            }
        });
    }
}