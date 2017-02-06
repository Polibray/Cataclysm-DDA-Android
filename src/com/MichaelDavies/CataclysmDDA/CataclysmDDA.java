package com.MichaelDavies.CataclysmDDA;

import org.libsdl.app.SDLActivity;
import android.util.Log;
import android.content.Context;
import android.os.Vibrator;
import android.widget.Toast;

public class CataclysmDDA extends SDLActivity {
    private static final String TAG = "CDDA";

    public void vibrate(int duration) {
        try {
            Vibrator v = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(duration);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void toast(final String message) {
        try {
            runOnUiThread(new Runnable() {
                public void run() {
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }
            });
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}