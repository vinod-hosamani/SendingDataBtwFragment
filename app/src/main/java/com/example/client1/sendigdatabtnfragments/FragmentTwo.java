package com.example.client1.sendigdatabtnfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by client1 on 1/4/2018.
 */

public class FragmentTwo extends Fragment {
    TextView f, l;

    public static FragmentTwo newInstance(CustModel custModel) {
        Bundle args = new Bundle();
        args.putParcelable("data", custModel);
        FragmentTwo fragment = new FragmentTwo();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.frag_two, container, false);
        f = (TextView) view.findViewById(R.id.firstName);
        l = (TextView) view.findViewById(R.id.lastName);

        CustModel custModel = getArguments().getParcelable("data");
        f.setText(custModel.firstName);
        l.setText(custModel.lastName);

        return view;
    }
}
