package com.example.drinkinggame.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.drinkinggame.R;

public class StartFragment extends Fragment {

    Button button_playGame;
    Button button_rules;
    Button button_about;

    private View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Navigation.findNavController(v).navigate(R.id.action_StartFragment_to_PlayerFragment);
        }
    };


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_start, container, false);

        button_playGame = rootview.findViewById(R.id.button_playGame);
        button_playGame.setOnClickListener(buttonListener);

        return rootview;
    }
}
