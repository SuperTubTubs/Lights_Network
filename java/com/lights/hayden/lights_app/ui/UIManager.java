package com.lights.hayden.lights_app.ui;

import android.app.Activity;
import android.content.Context;
import android.provider.Contacts;
import android.widget.Toast;

import com.lights.hayden.lights_app.support.Bootloader;
import com.lights.hayden.lights_app.support.ParentActivity;

import java.util.Observable;
import java.util.Observer;

/**
 * Class Name: UIManager
 * Description: Manager for the UI
 *
 * Date Created: 6/30/2018
 * @author Hayden
 */
public class UIManager implements Observer {
    public final static UIManager instance = new UIManager();
    private Activity parentActivity;
    private Context context;

    private UIManager(){

    }

    public static UIManager getInstance(){
        return instance;
    }


    @Override
    public void update(Observable observable, Object o) {
        if(observable instanceof Bootloader){
            parentActivity = ParentActivity.getParentActivity();
            context = parentActivity.getBaseContext();
        }
    }

    /**
     * Description: Displays a toast message
     * @param message A string containing a toast message
     */

    public void displayMessage(String message)
    {
        displayMessage(message, Toast.LENGTH_LONG);
    }


    /**
     * Description: Displays a toast message and allow the user to specify a display time.
     * @param message A string containing a toast message
     * @param displayTime An integer of the time specified
     */
    private void displayMessage(String message, int displayTime) {

        Toast.makeText(context, message, displayTime).show();
    }
}
