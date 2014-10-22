package ctec.screenchanger2pointohh;

import ctec.screenchanger2pointohh.R;
import ctec.screenchanger2pointohh.R.id;
import ctec.screenchanger2pointohh.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity
{
	private Button firstButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		firstButton = (Button) findViewById(R.id.firstButton);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		firstButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View currentView)
			{
				Intent myIntent = new Intent(currentView.getContext(), SecondActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	}
}
