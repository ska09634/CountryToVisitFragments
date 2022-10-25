package edu.uga.cs.countrytovisitfragments;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Actual main activity page. When the user is redirected here from the splash page, this
 * page will hold the two fragments and will switch between them.
 */
public class MainActivity2 extends AppCompatActivity {
    /**
     * On creation, this activity is simply a frame to switch between the two fragments.
     * @param savedInstanceState saved instance state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportFragmentManager().beginTransaction().add(R.id.frame, new FragmentA()).commit();

    } // on create
} // class