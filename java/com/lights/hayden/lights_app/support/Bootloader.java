package com.lights.hayden.lights_app.support;

import android.app.Activity;

import com.lights.hayden.lights_app.ui.UIManager;

import java.util.Observable;

/**
 * Class Name: Bootloader
 * Description: Boots the Lights application.
 *
 * Date Created: 6/30/2018
 * @author Hayden
 *
 */
public class Bootloader extends Observable {

    public Bootloader(Activity parentActivity){

        bootLightsApp(parentActivity);
    }

    private void bootLightsApp(Activity parentActivity) {

        ParentActivity.setParentActivity(parentActivity);

        addObserver(UIManager.getInstance());


        setChanged();
        notifyObservers();

        testInitialBootUP();
    }

    private void testInitialBootUP() {

        UIManager.getInstance().displayMessage("HELLO WORLD!!!!!");
    }

}
