package ir.mim_app.mim.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ir.mim_app.mim.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class courses_list_fragment extends Fragment {


    public courses_list_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_courses_list_fragment, container, false);
    }

}
