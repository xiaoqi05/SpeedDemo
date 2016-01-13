package xq.com.speed_demo.interfaces;

import android.location.Location;

/**
 * @AUTHOR by 肖齐
 * Created by 2016/1/13 13:11.
 */
public interface GPSCallback {
    public abstract void onGPSUpdate(Location location);
}
