package jakub.czachor.tyry.simpleweatherapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CitiesFragment.DataPassListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CitiesFragment cFragment = new CitiesFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.containercities, cFragment).commit();
    }

    @Override
    public void passData(String data) {
        WeatherFragment wFragment = new WeatherFragment();
        Bundle args = new Bundle();
        args.putString("city", data);
        wFragment.setArguments(args);
        getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.containercities, wFragment).commit();
    }

    @Override
    public void popToast(String data) {
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
    }
}
