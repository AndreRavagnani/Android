package br.com.softium.tactiumip;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private Button ipMonitor, ipClient, ipConf, tsGoogle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ipMonitor = (Button) findViewById(R.id.ipMonitor);
		ipMonitor.setOnClickListener(this);

		ipClient = (Button) findViewById(R.id.ipClient);
		ipClient.setOnClickListener(this);

		ipConf = (Button) findViewById(R.id.ipConf);
		ipConf.setOnClickListener(this);
		
		tsGoogle = (Button) findViewById(R.id.tsGoogle);
		tsGoogle.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent it = null;
		Uri uri = null;
		switch (v.getId()) {
		case R.id.ipMonitor:
			Toast.makeText(this, "Acessando o IPMonitor", Toast.LENGTH_SHORT).show();

			break;
		case R.id.ipClient:
			Toast.makeText(this, "Acessando o IPClient", Toast.LENGTH_SHORT).show();


			break;
		case R.id.ipConf:
			Toast.makeText(this, "Acessando As Configurações", Toast.LENGTH_SHORT).show();


			break;
			
		case R.id.tsGoogle:
			uri = Uri.parse("http://www.google.com.br");
			it = new Intent("android.intent.action.VIEW", uri);
			startActivity(it);

			break;

		}
	}

}
