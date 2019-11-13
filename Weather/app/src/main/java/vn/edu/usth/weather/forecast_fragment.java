package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.res.Resources;
import android.media.Image;
import android.os.Bundle;
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
        //text view
        TextView dayText = new TextView((getActivity()));
        dayText.setText("Thursday");
        dayText.setBackgroundColor(0xd85de8);
        dayText.setPadding(0, 15, 0, 15);

        //image view
        ImageView icon = new ImageView(getActivity());
        icon.setImageResource(R.drawable.weather_icon_png_4);
        icon.setScaleType(ImageView.ScaleType.FIT_CENTER);

//        View view  = new View(getContext());
//        view.setBackgroundColor(0x2000FF00);

        RelativeLayout.LayoutParams text_view_param = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        text_view_param.addRule(RelativeLayout.CENTER_IN_PARENT);
        RelativeLayout.LayoutParams image_view_param = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        View view = inflater.inflate(R.layout.forecast_fragment, container, false);
        view.setBackgroundColor(0x2000FF00);

        LinearLayout linear_layout1 = view.findViewById(R.id.linearlayout1);
        linear_layout1.setOrientation(LinearLayout.VERTICAL);
        linear_layout1.setGravity(Gravity.CENTER);
        linear_layout1.addView(dayText,text_view_param);
        linear_layout1.addView(icon, image_view_param);
        return view;
    }

}
