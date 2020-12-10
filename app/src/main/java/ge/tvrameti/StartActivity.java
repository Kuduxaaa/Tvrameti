package ge.tvrameti;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class StartActivity extends MainActivity 
{
    @Override
	private Button next_button;
	private TextView randomText;
	private String[] randomWords;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board);
		
		Intent in = getIntent();
		randomText = findViewById(R.id.randomText);
		next_button = findViewById(R.id.n_button);
		final Boolean sexy = in.getExtras().getBoolean("sexy");
		if (sexy){
			randomText.setTextColor(Color.RED);
			next_button.setBackgroundResource(R.drawable.sexy_button_style);
		}
		randomWords = in.getStringArrayExtra("randomWords");
		final List<String> list = new ArrayList<String>(Arrays.asList(randomWords));
		
		next_button.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				if (randomWords.length > 0){
					int randomNum = ThreadLocalRandom.current().nextInt(0, randomWords.length);
					randomText.setText("მე არასდროს " + randomWords[randomNum].toString());
					list.remove(randomWords[randomNum].toString());
					randomWords = list.toArray(new String[0]);
				} else {
					if (sexy) {
						randomText.setText("მორჩა წადით ეხლა და დაანგრიეთ :დ");
					} else {
						randomText.setText("თამაში დასრულდა წადით დაიძინეთ");
					}
				}
			}
		});
	}
}
