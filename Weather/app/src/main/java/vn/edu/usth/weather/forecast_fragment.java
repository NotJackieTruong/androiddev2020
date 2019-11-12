package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.res.Resources;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class forecast_fragment extends Fragment {
    public forecast_fragment(){};
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        //text view
//        TextView dayText = new TextView((getActivity()));
//        dayText.setText("Thursday");
//
//        //image view
//        ImageView icon = new ImageView(getActivity());
//        icon.setImageResource(R.drawable.weather_icon_png_4);
//
//        View view  = new View(getContext());
//        view.setBackgroundColor(0x2000FF00);
//
//        LinearLayout linear_layout1 = view.findViewById(R.id.linearlayout1);
//        linear_layout1.setOrientation(LinearLayout.VERTICAL);
//        linear_layout1.addView(dayText);
//        linear_layout1.addView(icon);
//        return view;
//    }
//

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.forecast_fragment, container, false);
    }
}
