package com.example.drinkinggame.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.drinkinggame.R;

public class SecondFragment extends Fragment {

    ImageView iv_card_back;
    TextView tv_todo;

    private View.OnClickListener imageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Navigation.findNavController(v).navigate(R.id.action_SecondFragment_to_FirstFragment);
        }
    };

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View rootview =inflater.inflate(R.layout.fragment_second, container, false);
        iv_card_back = rootview.findViewById(R.id.iv_card);
        tv_todo = rootview.findViewById(R.id.tv_todo);

        iv_card_back.setOnClickListener(imageListener);
        // Inflate the layout for this fragment
        return rootview;
    }




}
