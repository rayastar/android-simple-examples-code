package android.anil.com.androidmediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button playbtn,pausebtn,stopbtn;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.a);
        playbtn=(Button)findViewById(R.id.button);
        pausebtn=(Button)findViewById(R.id.button2);
        stopbtn=(Button)findViewById(R.id.button3);
        playbtn.setOnClickListener(this);
        pausebtn.setOnClickListener(this);
        stopbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                mediaPlayer.start();
                break;
            case R.id.button2:
                mediaPlayer.pause();
                break;
            case R.id.button3:
                mediaPlayer.stop();
                mediaPlayer= MediaPlayer.create(getApplicationContext(),R.raw.a);
                break;
        }
    }

    @Override
    protected void onPause() {
        mediaPlayer.pause();
        super.onPause();
    }
}
