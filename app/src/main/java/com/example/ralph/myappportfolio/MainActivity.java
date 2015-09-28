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

    public void launchApp1(View view) {
        Button myButton1 = (Button) findViewById(R.id.button1);
        Toast.makeText(getApplicationContext(), "This button will launch: " + myButton1.getText(), Toast.LENGTH_SHORT).show();
    }

    public void launchApp2(View view) {
        Button myButton2 = (Button) findViewById(R.id.button2);
        Toast.makeText(getApplicationContext(), "This button will launch: " + myButton2.getText(), Toast.LENGTH_SHORT).show();
    }

    public void launchApp3(View view) {
        Button myButton3 = (Button) findViewById(R.id.button3);
        Toast.makeText(getApplicationContext(), "This button will launch: " + myButton3.getText(), Toast.LENGTH_SHORT).show();
    }

    public void launchApp4(View view) {
        Button myButton4 = (Button) findViewById(R.id.button4);
        Toast.makeText(getApplicationContext(), "This button will launch: " + myButton4.getText(), Toast.LENGTH_SHORT).show();
    }

    public void launchApp5(View view) {
        Button myButton5 = (Button) findViewById(R.id.button5);
        Toast.makeText(getApplicationContext(), "This button will launch: " + myButton5.getText(), Toast.LENGTH_SHORT).show();
    }

    public void launchApp6(View view) {
        Button myButton6 = (Button) findViewById(R.id.button6);
        Toast.makeText(getApplicationContext(), "This button will launch: "+ myButton6.getText(), Toast.LENGTH_SHORT).show();
    }
}


