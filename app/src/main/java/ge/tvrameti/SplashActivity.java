package ge.tvrameti;

import android.app.*;
import android.os.*;
import android.content.Intent;

public class SplashActivity extends MainActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
		
		new Handler().postDelayed(new Runnable(){
			@Override
			public void run(){
				Intent mIntent = new Intent(SplashActivity.this, MainActivity.class);
				startActivity(mIntent);
				finish();
			}
		}, 1000);
    }
}
