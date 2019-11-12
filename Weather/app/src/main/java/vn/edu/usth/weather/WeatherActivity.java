package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("My_Tag", "This is on start");

        forecast_fragment forecastFragment = new forecast_fragment();
        getSupportFragmentManager().beginTransaction().add(R.id.forecastFragment, forecastFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("My_Tag", "This is on start");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("My_Tag", "This is on resume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("My_Tag", "This is on Pause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("My_Tag", "This is on Stop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("My_Tag", "This is on destroy");
    }


}
