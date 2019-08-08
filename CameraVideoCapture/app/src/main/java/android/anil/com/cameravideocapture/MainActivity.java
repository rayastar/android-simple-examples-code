package android.anil.com.cameravideocapture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoview;
    Uri uriVideo = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoview = (VideoView) findViewById(R.id.videoView);
    }


    public void vcapture(View v) {
        Intent int_video_camera = new Intent(android.provider.MediaStore.ACTION_VIDEO_CAPTURE);
        startActivityForResult(int_video_camera, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        uriVideo = data.getData();
        MediaController media_Controller = new MediaController(MainActivity.this);
        videoview.setMediaController(media_Controller);
        videoview.setVideoURI(uriVideo);
        videoview.start();
        super.onActivityResult(requestCode, resultCode, data);
    }
}
