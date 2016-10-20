package edu.sprakas1uncc.iotproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ToggleButton;


/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class Locks extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_locks, container, false);
        ToggleButton toggle = (ToggleButton) v.findViewById(R.id.garagelockbutton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    Log.d("toggle button","Button is ON");
                } else {
                    // The toggle is disabled
                    Log.d("toggle button", "Button is OFF");
                }
            }
        });

        ToggleButton toggle1 = (ToggleButton) v.findViewById(R.id.backdoorbutton);
        toggle1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    Log.d("toggle button","Button is ON");
                } else {
                    // The toggle is disabled
                    Log.d("toggle button", "Button is OFF");
                }
            }
        });

        ToggleButton toggle2 = (ToggleButton) v.findViewById(R.id.frontButton);
        toggle2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    Log.d("toggle button","Button is ON");
                } else {
                    // The toggle is disabled
                    Log.d("toggle button", "Button is OFF");
                }
            }
        });

        return v;

    }

}
