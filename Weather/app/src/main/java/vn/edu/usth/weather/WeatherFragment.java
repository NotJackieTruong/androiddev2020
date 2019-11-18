package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WeatherFragment extends Fragment {
    public WeatherFragment(){};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RelativeLayout weatherFragment = (RelativeLayout) inflater.inflate(R.layout.weather_fragment, container, false);

        ImageView weatherImage=weatherFragment.findViewById(R.id.imageCenter);
        weatherImage.setImageResource(R.drawable.weather_icon_windy_day);

        TextView text_top_left = weatherFragment.findViewById(R.id.textTopLeft);
        text_top_left.setText("12C");

        TextView text_top_right = weatherFragment.findViewById(R.id.textTopRight);
        text_top_right.setText("Friday");

        weatherFragment.removeAllViews();
        weatherFragment.addView(text_top_left);
        weatherFragment.addView(weatherImage);
        weatherFragment.addView(text_top_right);

        return weatherFragment;
    }
}