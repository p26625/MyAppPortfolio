package com.example.ralph.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchSpotifyApp(View view) {
        Button mySpotifyButton = (Button) findViewById(R.id.spotifyButtonId);
        Toast.makeText(getApplicationContext(), "This button will launch: " + mySpotifyButton.getText(), Toast.LENGTH_SHORT).show();
    }

    public void launchScoresApp(View view) {
        Button myScoresButton = (Button) findViewById(R.id.scoresButtonId);
        Toast.makeText(getApplicationContext(), "This button will launch: " + myScoresButton.getText(), Toast.LENGTH_SHORT).show();
    }

    public void launchLibraryApp(View view) {
        Button myLibraryButton = (Button) findViewById(R.id.libraryButtonId);
        Toast.makeText(getApplicationContext(), "This button will launch: " + myLibraryButton.getText(), Toast.LENGTH_SHORT).show();
    }

    public void launchBuildApp(View view) {
        Button myBuildButton = (Button) findViewById(R.id.buildButtonId);
        Toast.makeText(getApplicationContext(), "This button will launch: " + myBuildButton.getText(), Toast.LENGTH_SHORT).show();
    }

    public void launchBaconApp(View view) {
        Button myBaconButton = (Button) findViewById(R.id.baconButtonId);
        Toast.makeText(getApplicationContext(), "This button will launch: " + myBaconButton.getText(), Toast.LENGTH_SHORT).show();
    }

    public void launchCapstoneApp(View view) {
        Button myCapstoneButton = (Button) findViewById(R.id.capstoneButtonId);
        Toast.makeText(getApplicationContext(), "This button will launch: "+ myCapstoneButton.getText(), Toast.LENGTH_SHORT).show();
    }
}


