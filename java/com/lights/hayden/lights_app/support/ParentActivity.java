package com.lights.hayden.lights_app.support;

import android.app.Activity;

/**
 * Class Name: ParentActivity
 * Description: This class is a static shell so that other classes can use the lights activity
 * as a valid reference.
 * Date Created: 6/30/2018
 *
 * @author Hayden
 */
public class ParentActivity {

    private static Activity parentActivity;

    public static Activity getParentActivity(){
        return parentActivity;
    }

    public static void setParentActivity(Activity parentAct){
        parentActivity = parentAct;
    }

}
