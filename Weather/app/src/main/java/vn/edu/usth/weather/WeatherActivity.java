package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.io.FileInputStream;


public class WeatherActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private Adapter adapter;
    private TabLayout tabLayout;
    String filePath = Environment.getExternalStorageDirectory()+"D:\\NCT/NuthinButAGThang-DrDre_38gtx.mp3";
    final Handler handler = new Handler(Looper.getMainLooper()){
        @Override
        public void handleMessage(@NonNull Message msg) {
            String content = msg.getData().getString("server_response");
            Toast.makeText(getApplicationContext(), content, Toast.LENGTH_SHORT).show();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("My_Tag", "This is on start");
        viewPager = findViewById(R.id.weatherForecastViewPager);
        adapter = new Adapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        MediaPlayer mediaPlayer = MediaPlayer.create(WeatherActivity.this, R.raw.musicbackground);
        mediaPlayer.start();

        Toolbar toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);




//        forecast_fragment forecastFragment = new forecast_fragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.fragment2, forecastFragment).commit();
//
//        WeatherFragment weatherFragment = new WeatherFragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.weatherFragment, weatherFragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       switch (item.getItemId()){
           case R.id.refresh:
               //create new thread
               Thread thread = new Thread(new Runnable() {
                   @Override
                   public void run() {
                       try{
                           Thread.sleep(5000);
                       }
                       catch (InterruptedException e){
                           e.printStackTrace();
                       }
                       //assume we got our data from server
                       Bundle bundle = new Bundle();
                       bundle.putString("server_response", "some sample json here");
                       //notify main thread
                       Message message = new Message();
                       message.setData(bundle);
                       handler.sendMessage(message);
                   }
               });
               thread.start();
               break;
           case R.id.overflow_button:
               View overflowMenuView = findViewById(R.id.overflow_button);
               PopupMenu popupMenu = new PopupMenu(this, overflowMenuView);
               popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                   @Override
                   public boolean onMenuItemClick(MenuItem item) {
                       switch (item.getItemId()){
                           case R.id.settings:
                           Intent i = new Intent(getApplicationContext(), PrefActivity.class);
                           startActivity(i);
                           return true;
                           case R.id.item1:
                               Toast.makeText(getApplicationContext(), "Item 1 is pressed", Toast.LENGTH_SHORT).show();
                               return true;
                           case R.id.item2:
                               Toast.makeText(getApplicationContext(), "Item 2 is pressed", Toast.LENGTH_SHORT).show();
                               return true;
                           default:
                               return false;
                       }
                   }
               });
               popupMenu.inflate(R.menu.popup_menu);
               popupMenu.show();
               break;
       }
       return super.onOptionsItemSelected(item);
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
    protected void onRestart() {
        super.onRestart();
        Log.i("My_Tag", "This is on restart");
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
