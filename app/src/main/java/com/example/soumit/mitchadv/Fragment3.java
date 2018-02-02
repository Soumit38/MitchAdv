package com.example.soumit.mitchadv;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Soumit on 2/2/2018.
 */

public class Fragment3 extends Fragment {

    private static final String TAG = "Fragment1";

    private Button btnNaveFrag1;
    private Button btnNaveFrag2;
    private Button btnNaveFrag3;
    private Button btnNavSecondActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3_layout, container, false);

        btnNaveFrag1 = (Button) view.findViewById(R.id.btnNavFrag1);
        btnNaveFrag2 = (Button) view.findViewById(R.id.btnNavFrag2);
        btnNaveFrag3 = (Button) view.findViewById(R.id.btnNavFrag3);
        btnNavSecondActivity = (Button) view.findViewById(R.id.btnNavSecondActivity);
        Log.d(TAG, "onCreateView: Started");

        btnNaveFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to fragment 1", Toast.LENGTH_SHORT).show();
                //navigate to the fragment
                ((MainActivity)getActivity()).setViewPager(0);

            }
        });


        btnNaveFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to fragment2", Toast.LENGTH_SHORT).show();
                //navigate to the fragment
                ((MainActivity)getActivity()).setViewPager(1);

            }
        });


        btnNaveFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to fragment 3", Toast.LENGTH_SHORT).show();
                //navigate to the fragment
                ((MainActivity)getActivity()).setViewPager(2);

            }
        });


        btnNavSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to second Activity", Toast.LENGTH_SHORT).show();
                //navigate to the fragment
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}





















