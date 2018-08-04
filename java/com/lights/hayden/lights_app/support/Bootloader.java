package com.lights.hayden.lights_app.support;

import android.app.Activity;

import com.lights.hayden.lights_app.lights.LightConfig;
import com.lights.hayden.lights_app.network.ConfigDaemon;
import com.lights.hayden.lights_app.ui.TableUIManager;
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
        addObserver(ConfigDaemon.getInstance());
        addObserver(UIManager.getInstance().getTableUIManager());

        setChanged();
        notifyObservers();

        bootUp();
    }

    private void bootUp() {

        UIManager.getInstance().displayMessage("Welcome");

        LightConfig off = new LightConfig();
        off.addColor(Constants.BLACK_ID);
        off.setPattern(Constants.OFF_PATTERN_ID);
        off.setKey();

        LightConfig onWhite = new LightConfig();
        onWhite.addColor(Constants.WHITE_ID);
        onWhite.setPattern(Constants.ON_PATTERN_ID);
        onWhite.setKey();

        ConfigDaemon.getInstance().addLightConfig(off);
        ConfigDaemon.getInstance().addLightConfig(onWhite);
    }

}
