package com.example.videoplayer;

import android.R;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;



import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;



	public class VideoPlayer extends Activity implements 
    OnBufferingUpdateListener, OnCompletionListener, 
    MediaPlayer.OnPreparedListener, SurfaceHolder.Callback {
private MediaPlayer mediaPlayer;
private SurfaceView surfaceView;
private SurfaceHolder surfaceHolder;
private EditText editText;
private ImageButton bPlay, bPause, bStop, bLog;
private TextView logTextView;
private boolean pause;
private String path;
private int savePos = 0;

@SuppressWarnings("deprecation")
public void onCreate(Bundle bundle) {
super.onCreate(bundle);
setContentView(R.layout.activity_main);
surfaceView = (SurfaceView) findViewById(R.id.surfaceView);
surfaceHolder = surfaceView.getHolder();
surfaceHolder.addCallback(this);
