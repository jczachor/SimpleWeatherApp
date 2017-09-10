package jakub.czachor.tyry.simpleweatherapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class WeatherFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather, container, false);
        TextView checkedCityWeather = (TextView) view.findViewById(R.id.cityname);
        Bundle args = getArguments();

        if(args != null) {
            checkedCityWeather.setText(args.getString("city"));
        }

        return view;
    }

}
