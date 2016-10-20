package edu.sprakas1uncc.iotproject;


import android.os.Bundle;
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


    public Lights() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lights, container, false);
        final TextView textView = (TextView) v.findViewById(R.id.tall1);
        final SeekBar myseekbar = (SeekBar) v.findViewById(R.id.seekbarall);

        Switch s = (Switch) v.findViewById(R.id.allSwitch);
        s.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LIghtQueryThread lIghtQueryThread = new LIghtQueryThread();


            }
        });

//while (status) {
        //{


        myseekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //if (status) {
                    percentage = progress;

                    Log.d("seekbar", "reached pregress change");
                    textView.setText(Integer.toString(percentage));
              //  }
               // else
               // textView.setText("");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

//}

//       // if(status){
//            SeekBar mySeekbar = (SeekBar) v.findViewById(R.id.seekbarall);
//
//            mySeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
//
//                public void OnProgressChanged(SeekBar seekBar, int progress,boolean fromuser){
//                    percentage = progress;
//                    //fromuser=true;
//                }
//            });
        //  }

        return v;

    }
}


//}
