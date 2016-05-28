package sunshine.com.example.hresende.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] data = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/60",
                "Wednesday - Cloudy - 65/50",
                "Thursday - Asteroids - 85/65",
                "Friday - HELP TRAPPED IN WEATHERSTATION - 60/45",
                "Saturday - Sunny - 88/75",
                "Sunday - Heavy Rain - 76/63"};

        List<String> weekForecast = new ArrayList<>(Arrays.asList(data));
        mForecastAdapter = new ArrayAdapter<>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,weekForecast);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
