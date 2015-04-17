package com.example.a.t16_location;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends ActionBarActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocationManager manager = (LocationManager) getSystemService(LOCATION_SERVICE);
        textView = (TextView)findViewById(R.id.textView);
        String str = "";

        List<String> providers = manager.getAllProviders();
        for(int i=0; i<providers.size(); i++){
            str += "위치 제공자 "+providers.get(i)+"의 상태 : "+
                    manager.isProviderEnabled(providers.get(i)) + "\n";
        }

        textView.setText(str);

        LocationListener listener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                String strLoc = "위도 : "+location.getLatitude() + " 경도 : "+
                        location.getLongitude() + " 고도 : "+ location.getAltitude();

                textView.setText(strLoc);
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        };

        manager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0,0, listener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
