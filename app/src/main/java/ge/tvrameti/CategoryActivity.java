package ge.tvrameti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CategoryActivity extends MainActivity 
{
    @Override
	private Button bcat01,bcat02,bcat03, bcat04;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
		final Questions quest = new Questions();
		
		bcat01 = findViewById(R.id.cat01);
		bcat02 = findViewById(R.id.cat02);
		bcat03 = findViewById(R.id.cat03);
		bcat04 = findViewById(R.id.cat04);
		
		bcat01.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent in = new Intent(CategoryActivity.this, StartActivity.class);
				in.putExtra("randomWords", quest.ForKids);
				startActivity(in);
				finish();
			}
		});
		
		bcat04.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent in = new Intent(CategoryActivity.this, StartActivity.class);
				in.putExtra("randomWords", quest.ForLovers);
				startActivity(in);
				finish();
			}
		});
		
		bcat02.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent in = new Intent(CategoryActivity.this, StartActivity.class);
				in.putExtra("randomWords", quest.ForNormalHumans);
				startActivity(in);
				finish();
			}
		});
			
		bcat03.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent in = new Intent(CategoryActivity.this, StartActivity.class);
				in.putExtra("randomWords", quest.ForSexy);
				in.putExtra("sexy", true);
				startActivity(in);
				finish();
			}
		});
	}
}
