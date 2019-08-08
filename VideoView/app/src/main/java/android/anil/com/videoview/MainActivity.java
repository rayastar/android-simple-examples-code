package android.anil.com.videoview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView=(VideoView)findViewById(R.id.videoView);
//        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.sample1));
//        videoView.setVideoURI(Uri.parse(URL));
        videoView.setMediaController(new MediaController(this));
        videoView.start();
    }
}
