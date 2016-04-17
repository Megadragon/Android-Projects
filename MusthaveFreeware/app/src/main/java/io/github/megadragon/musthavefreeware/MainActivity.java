package io.github.megadragon.musthavefreeware;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// AIDA64 button
		Button btnAIDA64 = (Button) findViewById(R.id.aida64_button);
		if (btnAIDA64 != null) {
			btnAIDA64.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					startActivity(new Intent(MainActivity.this, AIDA64Activity.class));
				}
			});
		}

		// CCleaner button
		Button btnCCleaner = (Button) findViewById(R.id.ccleaner_button);
		if (btnCCleaner != null) {
			btnCCleaner.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					startActivity(new Intent(MainActivity.this, CleanerActivity.class));
				}
			});
		}

		// ES File Explorer button
		Button btnESFileExplorer = (Button) findViewById(R.id.es_file_explorer_button);
		if (btnESFileExplorer != null) {
			btnESFileExplorer.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					startActivity(new Intent(MainActivity.this, ESFileExplorerActivity.class));
				}
			});
		}

		// FBReader button
		Button btnFBReader = (Button) findViewById(R.id.fbreader_button);
		if (btnFBReader != null) {
			btnFBReader.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					startActivity(new Intent(MainActivity.this, FBReaderActivity.class));
				}
			});
		}

		// WPS Office button
		Button btnWPSOffice = (Button) findViewById(R.id.wps_office_button);
		if (btnWPSOffice != null) {
			btnWPSOffice.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					startActivity(new Intent(MainActivity.this, WPSOfficeActivity.class));
				}
			});
		}

		// About button
		Button btnAbout = (Button) findViewById(R.id.about_button);
		if (btnAbout != null) {
			btnAbout.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					AlertDialog.Builder dlgAlert = new AlertDialog.Builder(MainActivity.this);
					dlgAlert.setTitle(R.string.app_name);
					dlgAlert.setMessage(R.string.copyright);
					dlgAlert.setPositiveButton(R.string.OK, null);
					dlgAlert.setCancelable(true);
					dlgAlert.create().show();
				}
			});
		}
	}
}
