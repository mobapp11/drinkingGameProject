package com.example.drinkinggame.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drinkinggame.R;
import com.google.android.material.textfield.TextInputLayout;

public class PlayerFragment extends Fragment {
    CardView cv_cardView;
    TextInputLayout tip_textInputLayout;
    Button buttonSubmitName;
    Button buttonStartGame;
    RecyclerView rv_namesList;

    private View.OnClickListener buttonStartGameListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Navigation.findNavController(v).navigate(R.id.action_PlayerFragment_to_SecondFragment);
        }
    };

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_players, container, false);
        cv_cardView = rootview.findViewById(R.id.art_card_view);
        tip_textInputLayout= rootview.findViewById(R.id.textInputLayout);
        buttonSubmitName = rootview.findViewById(R.id.buttonSubmitName);
        buttonStartGame = rootview.findViewById(R.id.buttonStartGame);
        rv_namesList = rootview.findViewById(R.id.comicArt_rv);
        buttonStartGame.setOnClickListener(buttonStartGameListener);
        return rootview;
    }
}
