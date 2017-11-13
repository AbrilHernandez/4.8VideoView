package www.ittepic.edu.videoview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath("https://ia600201.us.archive.org/22/items/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4");
        videoView.start();

        videoView.setVideoPath("https://ia600201.us.archive.org/22/items/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4");
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
    }
}
