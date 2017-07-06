package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.week1.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Tab4.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tab4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab4 extends Fragment {

    public Tab4() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static Tab4 newInstance(String param1, String param2) {
        Tab4 fragment = new Tab4();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab4, container, false);
    }

}
