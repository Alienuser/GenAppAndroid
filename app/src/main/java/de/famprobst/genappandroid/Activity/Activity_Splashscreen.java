/*******************************************************************************
 * GenAppAndroid
 * Copyright (C) 2017 Lars Helmuth Probst - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * This file is part of the project GenAppAndroid.
 *
 * @version 1.0 Release
 * @author Lars Helmuth Probst (Alienuser)
 * @copyright 2017 Lars Helmuth Probst
 * @link http://www.Lars-Probst.de
 ******************************************************************************/

package de.famprobst.genappandroid.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import de.famprobst.genappandroid.R;

public class Activity_Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openMain();
            }
        }, 1200);
    }

    private void openMain() {
        Intent intentMain = new Intent(Activity_Splashscreen.this, Activity_Main.class);
        startActivity(intentMain);
        finish();
    }
}
