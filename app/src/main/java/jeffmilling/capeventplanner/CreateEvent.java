package jeffmilling.capeventplanner;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by Max on 9/23/2015.
 */
public class CreateEvent extends Fragment {

    //TextView mainTextView;
    //View listView;

    public CreateEvent() {

    }

    @Override
    public View onCreateView(LayoutInflater inflator, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment.
        return inflator.inflate(R.layout.fragment_create_event, container, false);
    }
}
