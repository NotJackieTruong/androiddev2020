package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class forecast_fragment extends Fragment {
    public forecast_fragment(){};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.forecast_fragment, container, false);

        LinearLayout vertical_layout= view.findViewById(R.id.vertical_layout);

        LinearLayout horizontal_row;
        //create textView and ImageView
        TextView dayText;
        ImageView icon;
        TextView weather_forecast;

        for(int i=1; i<=7; i++){
            horizontal_row=(LinearLayout) inflater.inflate(R.layout.horizontal_row, container, false);
            dayText =horizontal_row.findViewById(R.id.dayText);
            icon = horizontal_row.findViewById(R.id.icon);
            weather_forecast = horizontal_row.findViewById(R.id.weather_forcast);
            
            if(i==1){
                dayText.setText("Monday");
                icon.setImageResource(R.drawable.weather_icon_sunny);
                weather_forecast.setText("Sunny");
            } else if(i==2){
                dayText.setText("Tuesday");
                icon.setImageResource(R.drawable.weather_icon_windy_day);
                weather_forecast.setText("Windy");
            } else if(i==3){
                dayText.setText("Wednesday");
                icon.setImageResource(R.drawable.weather_icon_cloudy_rainy_day);
                weather_forecast.setText("Cloudy Rainy");
            } else if(i==4){
                dayText.setText("Thursday");
                icon.setImageResource(R.drawable.weather_icon_windy_day);
                weather_forecast.setText("Windy");
            } else if(i==5){
                dayText.setText("Friday");
                icon.setImageResource(R.drawable.weather_icon_sunny);
                weather_forecast.setText("Sunny");
            } else if(i==6){
                dayText.setText("Saturday");
                icon.setImageResource(R.drawable.weather_icon_windy_day);
                weather_forecast.setText("Windy");
            } else if(i==7){
                dayText.setText("Sunday");
                icon.setImageResource(R.drawable.weather_icon_cloudy_rainy_day);
                weather_forecast.setText("Cloudy Rainy");
            }

            vertical_layout.addView(horizontal_row);
        }


        return view;
    }
}
