package pk.edu.pucit.xrayprank;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;

/**
 * Created by Rizwan on 26-Apr-17.
 */
public class HelperClass {

    public static boolean doMobileHasCamera(Context context) {
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA);
    }

    public static Camera getCameraInstance() {

        Camera c = null;

        try {
            c = Camera.open();
        }catch(Exception e){
        }
        return c;

    }

}
