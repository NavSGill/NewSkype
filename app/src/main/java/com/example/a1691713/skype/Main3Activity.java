package com.example.a1691713.skype;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Main3Activity extends AppCompatActivity {

    public void mainClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button buttonPlayVideo2 = (Button)findViewById(R.id.button1);
        getWindow().setFormat(PixelFormat.UNKNOWN);
//displays a video file
        VideoView mVideoView2 = (VideoView)findViewById(R.id.videoView1);
        String uriPath2 = "android.resource://com.example.a1691713.skype/"+R.raw.movie;
        Uri uri2 = Uri.parse(uriPath2);
        mVideoView2.setVideoURI(uri2);
        mVideoView2.requestFocus();
        mVideoView2.start();
        buttonPlayVideo2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView1);
// VideoView mVideoView = new VideoView(this);
                String uriPath = "android.resource://com.example.a1691713.skype/" + R.raw.movie;
                Uri uri2 = Uri.parse(uriPath);
                mVideoView2.setVideoURI(uri2);
                mVideoView2.requestFocus();
                mVideoView2.start();
            }
        });
    }
}
