package com.ahmad.video_list;
import android.app.*;
import android.os.*;
import android.widget.*;
import com.google.android.gms.ads.*;
import android.net.*;

public class Main11Activity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


	
		VideoView yousuf = findViewById(R.id.video_view);



     //   String ahmad = "https://afro-muelheim.000webhostapp.com/001.mp4";
        String ahmad = "android.resource://" + getPackageName() + "/" + R.raw.algna;
        Uri uri = Uri.parse(ahmad);
        yousuf.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        yousuf.setMediaController(mediaController);
        mediaController.setAnchorView(yousuf);

        yousuf.start();
	
	
	
		
		}	
}
