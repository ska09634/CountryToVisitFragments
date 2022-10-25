package edu.uga.cs.countrytovisitfragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Information of the selected country will be displayed on this fragment.
 * The user can go back to the list fragment and keep selected different countries.
 */
public class FragmentB extends Fragment {
    static TextView description;
    static ImageView flag;

    /**
     * On creation the fragment will replace the list fragment and display the information of the
     * selected country. Depending on the country chosen/id number, the respective information for
     * that country will be displayed.
     * @param inflater inflater
     * @param container  container
     * @param savedInstanceState saved instance state
     * @return
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        flag = (ImageView) view.findViewById(R.id.tourist);
        description = (TextView) view.findViewById(R.id.description);
        Bundle bundle = this.getArguments();
        int data = bundle.getInt("position");

        if (data == 0) { // japan
            flag.setImageResource(R.drawable.fuji);
            description.setText("Japan is an archipelago nation located in eastern Asia." +
                    "\n\nPopulation: 125 million" +
                    "\n\nCapital: Tokyo" +
                    "\n\nPlaces to visit: Mount Fuji, Tokyo Tower, Shrine Island" +
                    "\n\nCurrency: Yen (1 JPY = 0.007 USD)" +
                    "\n\nModes of Transportation: Bullet Trains, Taxi, Subways");
        } else if (data == 1) { // germany
            flag.setImageResource(R.drawable.brandenburg);
            description.setText("Germany is a country in central Europe bordered by Denmark, Poland, Czechia, Austria, Switzerland, France, Luxembourg, Belgium, and the Netherlands. " +
                    "\n\nPopulation: 83 million" +
                    "\n\nCapital: Berlin" +
                    "\n\nPlaces to visit: Brandenburg Gate, Neuschwanstein Castle, Berlin Cathedral" +
                    "\n\nCurrency: Euro (1 EUR = ~1 USD)" +
                    "\n\nModes of Transportation: S-Bahn, Cycling, Trams");
        } else if (data == 2) { // australia
            flag.setImageResource(R.drawable.opera);
            description.setText("Australia is a sovereign country consisting of the mainland Australian continent, and it is the largest country in Oceania." +
                    "\n\nPopulation: 25 million" +
                    "\n\nCapital: Canberra" +
                    "\n\nPlaces to visit: Great Barrier Reef, Sydney Opera House, Uluru" +
                    "\n\nCurrency: Dollar (1 AUD = 0.67 USD)" +
                    "\n\nModes of Transportation: Ferries, Trams, Buses");
        } else if (data == 3) { // brazil
            flag.setImageResource(R.drawable.christ);
            description.setText("Brazil is the largest country in South America, and it is bordered by Uruguay, Argentina, Paraguay, Bolivia, Peru, Colombia, Venezuela, Guyana, and Suriname." +
                    "\n\nPopulation: 214 million" +
                    "\n\nCapital: Brasília" +
                    "\n\nPlaces to visit: Christ the Redeemer, Copacabana Beach, Sugarloaf Mountain" +
                    "\n\nCurrency: Real (1 BRL = 0.19 USD)" +
                    "\n\nModes of Transportation: Buses, Cycling, Cars");
        } else if (data == 4) { // egypt
            flag.setImageResource(R.drawable.sphinx);
            description.setText("Egypt is a country in northeast Africa bordered by Palestine, Israel, Sudan and Libya." +
                    "\n\nPopulation: 102 million" +
                    "\n\nCapital: Cairo" +
                    "\n\nPlaces to visit: The Sphinx, Abu Simbel Temples, Valley of the Kings" +
                    "\n\nCurrency: Pound (1 EGP = 0.051 USD)" +
                    "\n\nModes of Transportation: Tuk Tuk, River Buses, Airplanes");
        }
        return view;
    } // on create
} // class