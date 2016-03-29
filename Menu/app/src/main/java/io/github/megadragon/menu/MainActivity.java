package io.github.megadragon.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView currentMenuItem = (TextView) findViewById(R.id.menu_item_1);
        String sMenuItemText = currentMenuItem.getText().toString();
        Log.v("MainActivity", sMenuItemText);

        // Find second menu item TextView and print the text to the logs
        currentMenuItem = (TextView) findViewById(R.id.menu_item_2);
        sMenuItemText = currentMenuItem.getText().toString();
        Log.v("MainActivity", sMenuItemText);

        // Find third menu item TextView and print the text to the logs
        currentMenuItem = (TextView) findViewById(R.id.menu_item_3);
        sMenuItemText = currentMenuItem.getText().toString();
        Log.v("MainActivity", sMenuItemText);

    }
}
