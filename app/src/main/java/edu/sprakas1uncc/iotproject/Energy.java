package edu.sprakas1uncc.iotproject;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class Energy extends Fragment {

    TextView energy_consume_therm;
    TextView energy_consume_lights;
Timer updateTimertherm;
Timer updateTimerlight;
    public static int energy_cons_thermostat=0;


    public Energy() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v1 = inflater.inflate(R.layout.fragment_energy, container, false);
        energy_consume_therm =(TextView)v1.findViewById(R.id.readingthermo);
        energy_consume_lights =(TextView)v1.findViewById(R.id.readinglight);
        updateTimertherm = new Timer();
        updateTimerlight = new Timer();
        return v1;
    }

    @Override
    public void onStart(){
        super.onStart();
        updateTimertherm.scheduleAtFixedRate(new updateTask(new Handler(),this),0, 1000);
        updateTimerlight.scheduleAtFixedRate(new updateTask(new Handler(),this),0, 1000);
    }
    @Override
    public void onStop(){
        super.onStop();
        updateTimertherm.cancel();
        updateTimerlight.cancel();


    }
    public  void update(){
        energy_consume_therm.setText(Integer.toString(energy_cons_thermostat));
    }
    public  void update_light(){
        energy_consume_lights.setText(Integer.toString(Lights.consumption_light));
    }

    private class  updateTask extends TimerTask {
        Handler handler1;
        Energy energy;
        public updateTask(Handler handler1, Energy energy){
            super();
            this.handler1=handler1;
            this.energy=energy;
        }
        @Override
        public void run(){
            handler1.post(new Runnable() {
                @Override
                public void run() {
                    energy.update();
                    energy.update_light();
                }
            });

        }









    }




}


