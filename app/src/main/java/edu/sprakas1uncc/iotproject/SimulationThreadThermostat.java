package edu.sprakas1uncc.iotproject;

import android.icu.util.TimeUnit;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by harshvardhan on 10/19/16.
 */

public class SimulationThreadThermostat extends Thermostats implements Runnable {

    Thread thread = new Thread(this);
    public SimulationThreadThermostat()
    {
        thread.start();
    }




    public void run()
    {

        try {


            while (true) {
                switch (Thermostats.temp_mode) {
                    case "heat":
                        if (Thermostats.current_temp_upstairs <= Thermostats.control_temp_upstairs && Thermostats.current_temp_upstairs < 80) {

                            Thread.sleep(1000);
                            Thermostats.current_temp_upstairs += 2;




                        }
                        break;

                    case "cool":

                        if(Thermostats.current_temp_upstairs >= Thermostats.control_temp_upstairs && Thermostats.current_temp_upstairs > 45) {
                            Thread.sleep(100000);
                            Thermostats.current_temp_upstairs -= 2;

                    }
                    break;

                    default:
                        break;

                }

            }

        }
        catch (Exception e)
        {
            Log.d("threadthermostat","catch thread error");
        }


    }
}