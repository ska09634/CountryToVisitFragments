package edu.uga.cs.countrytovisitfragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * List Fragment that displays 5 countries. When the user selects a country, the information page will
 * pop up.
 */
public class FragmentA extends Fragment {
ListView lv;
ArrayAdapter<String> adapter;
String[] data = {"Japan","Germany", "Australia", "Brazil", "Egypt"};

    /**
     * Empty constructor for a new fragment
     */
    public FragmentA() {
        // Required empty public constructor
    }

    /**
     * What is shown when the fragment is created.
     * @param inflater inflater
     * @param container container that holds fragment
     * @param savedInstanceState saved Instance State
     * @return viewport
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);
       View view = inflater.inflate(R.layout.fragment_a, container, false);
       lv = (ListView) view.findViewById(R.id.idListView);
       adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
       lv.setAdapter(adapter);
       lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Bundle bundle = new Bundle();
            bundle.putInt("position", i);

            FragmentB fragmentB = new FragmentB();
            fragmentB.setArguments(bundle);
            getFragmentManager().beginTransaction().replace(R.id.frame, fragmentB, null).addToBackStack(null).commit();

           } // on item click
       });
        return view;
    } // on create view
} // class