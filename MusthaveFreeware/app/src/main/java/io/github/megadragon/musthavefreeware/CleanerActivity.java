package io.github.megadragon.musthavefreeware;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CleanerActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cleaner);

		// Download button
		Button btnDownload = (Button) findViewById(R.id.ccleaner_download);
		if (btnDownload != null) {
			btnDownload.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent intentGooglePlay = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + R.string.ccleaner_package));
					startActivity(intentGooglePlay);
				}
			});
		}
	}
}
