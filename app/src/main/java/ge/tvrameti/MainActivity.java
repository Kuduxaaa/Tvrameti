package ge.tvrameti;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import java.lang.reflect.Array;
import android.widget.Toast;

public class MainActivity extends Activity 
{
    @Override
	private Button start,quit;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		start = findViewById(R.id.start_btn);
		quit = findViewById(R.id.quit_btn);
		
		start.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent in = new Intent(MainActivity.this, CategoryActivity.class);
				startActivity(in);
			}
		});
		
		quit.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				finish();
			}
		});
			
    }
}
