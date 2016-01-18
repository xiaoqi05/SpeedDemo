package xq.com.speed_demo.interfaces;

import android.location.Location;


public interface GPSCallback {
    public abstract void onGPSUpdate(Location location);
}
