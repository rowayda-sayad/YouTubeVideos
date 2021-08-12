package com.example.youtubevideosudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shankar.youtube_video_player.YoutubeVideoPlayer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Playing youtube video
        //YoutubeVideoPlayer.playVideo(MainActivity.this,"XqZsoesa55w");

        //Playing audio

        Button playBtn = findViewById(R.id.playBtn);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bensound_creativeminds);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                // MediaPlayer.create(this, R.raw.bensound_creativeminds).start();
            }
        });


    }
}