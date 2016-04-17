package io.github.megadragon.musthavefreeware;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AIDA64Activity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aida64);

		// Download button
		Button btnDownload = (Button) findViewById(R.id.aida64_download);
		if (btnDownload != null) {
			btnDownload.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent intentGooglePlay = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + R.string.aida64_package));
					startActivity(intentGooglePlay);
				}
			});
		}
	}
}
