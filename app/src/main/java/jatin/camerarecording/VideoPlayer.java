package jatin.camerarecording;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by jatin on 7/26/2017.
 */

public class VideoPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_player);
        VideoView vidView = (VideoView)findViewById(R.id.myVideo);
        String UriAddress=Camera2VideoFragment.mCropVideoFileName;
        Uri vidUri= Uri.parse(UriAddress);
        vidView.setVideoURI(vidUri);
        vidView.start();
        MediaController vidControl = new MediaController(this);
        vidControl.setAnchorView(vidView);
        vidView.setMediaController(vidControl);
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
}
