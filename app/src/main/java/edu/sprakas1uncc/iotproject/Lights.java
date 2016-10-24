package edu.sprakas1uncc.iotproject;


import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.widget.TextViewCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class Lights extends Fragment {
    public static Boolean status = false;
    public static Boolean status_changed = false;
    public static int percentage = 0;
    public static int percentage1 = 0;
    public static int percentage2 = 0;
    public static int consumption_light = 0;










    public Lights() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_lights, container, false);
        final TextView textView = (TextView) v.findViewById(R.id.tall1);
        final TextView textView1 = (TextView) v.findViewById(R.id.tall2);
        final TextView textView2 = (TextView) v.findViewById(R.id.tall3);
     final SeekBar    myseekbar = (SeekBar) v.findViewById(R.id.seekbarall);
        final SeekBar myseekbar1 = (SeekBar) v.findViewById(R.id.seekbarmain);
        final SeekBar myseekbar2 = (SeekBar) v.findViewById(R.id.seekbarupstair);


        Switch s = (Switch) v.findViewById(R.id.allSwitch);
        s.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LIghtQueryThread lIghtQueryThread = new LIghtQueryThread();


            }
        });




        myseekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                   percentage = progress;

                    Log.d("seekbar", "reached pregress change");
                    textView.setText(Integer.toString(percentage));
                          }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        myseekbar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                percentage1 = progress;

                Log.d("seekbar", "reached pregress change");
                textView1.setText(Integer.toString(percentage1));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        myseekbar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                percentage2 = progress;

                Log.d("seekbar", "reached pregress change");
                textView2.setText(Integer.toString(percentage2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        return v;

    }




//  @Override
//    public void onSaveInstanceState(Bundle outState){
//
//      super.onSaveInstanceState(outState);
//      outState.putSerializable("count", consumption_light);

 // }




}


//}
