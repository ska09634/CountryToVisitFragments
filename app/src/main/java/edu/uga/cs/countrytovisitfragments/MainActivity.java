package edu.uga.cs.countrytovisitfragments;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Splash page for the app.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * When created the page will display the welcome screen and a button that will direct
     * the user to the list fragment.
     * @param savedInstanceState saved Instance State
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button viewCountries = findViewById(R.id.button);
       viewCountries.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(MainActivity.this, MainActivity2.class));
           }
       });

    } // on create
} // class