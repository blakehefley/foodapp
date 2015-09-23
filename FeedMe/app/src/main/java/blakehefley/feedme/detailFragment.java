package blakehefley.feedme;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Random;

/**
 * Created by Blake on 9/23/2015.
 */
public class detailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail, container, false);
        Integer[] myInts = {5,23,642,632,36,34,7,2,45,12};
        Random rand = new Random();
        Integer rando = myInts[rand.nextInt(10)];

        TextView t = (TextView) rootView.findViewById(R.id.Random);
        t.setText(rando.toString());
        return rootView;
    }
}
