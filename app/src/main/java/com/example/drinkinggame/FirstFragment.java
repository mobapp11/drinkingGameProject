package com.example.drinkinggame;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import java.util.Random;

public class FirstFragment extends Fragment {

    ImageView iv_card_front;
    TextView tv_todo;
    Button buttonNextCard;
    String[] listKinds;
    Random r_number;
    Random r_soort;
    String randomKind;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View rootview = inflater.inflate(R.layout.fragment_first, container, false);


        iv_card_front = rootview.findViewById(R.id.iv_card);

        tv_todo = rootview.findViewById(R.id.tv_todo);
        r_number = new Random();
        r_soort = new Random();
        buttonNextCard = rootview.findViewById(R.id.buttonNextCard);
        listKinds = new String[]{"c", "d", "h", "s"};
        buttonNextCard.setOnClickListener(buttonNextCardListener);

        int card = r_number.nextInt(12) + 2; //this is for card 2 - 14


        int letter = r_soort.nextInt(listKinds.length);
        randomKind = (String) (listKinds[letter]);

        //show card images
        int cardImage = getResources().getIdentifier("card_" + card + "_" + randomKind, "drawable", getActivity().getPackageName());
        iv_card_front.setImageResource(cardImage);
        //set text
        if (card == 2) {
            tv_todo.setText("Je moet zelf 2 slokken doen.");
        }
        if (card == 3) {
            tv_todo.setText("Je mag 3 slokken aan iemand anders uitdelen.");
        }
        if (card == 4) {
            tv_todo.setText("Er moet een gezamelijk shotje sterkedrank aan de tafel gedronken worden.");
        }
        if (card == 5) {
            tv_todo.setText("'Fiks a wife'. Dit wil zeggen dat je iemand moet binnenzwieren.");
        }
        if (card == 6) {
            tv_todo.setText("Je moet 10 dabs zo snel mogelijk achter elkaar doen.");
        }
        if (card == 7) {
            tv_todo.setText("Geen medeleven. Je moet 10 seconde aan en stuk drinken.");
        }
        if (card == 8) {
            tv_todo.setText("Een groepsknuffel houden, om mekaars aanwezigheid te appreciëren");
        }
        if (card == 9) {
            tv_todo.setText("Walid drinkt. Indien je geen Walid aan tafel hebt, moet de kleinste persoon aan de tafel drinken.");
        }
        if (card == 10) {
            tv_todo.setText("Je mag een object/persoon naar keuze swaffelen.");
        }
        if (card == 11) {
            tv_todo.setText("Je mag een halve minuut niet naar het toilet gaan. Indien je dit toch doet, moet je een adje doen.");
        }
        if (card == 12) {
            tv_todo.setText("For the team. Iedereen moet drinken, buiten jijzelf.");
        }
        if (card == 13) {
            tv_todo.setText("Je moet een half glas van een zwaar bier atten. Schol");
        }
        if (card == 14) {
            tv_todo.setText("Je mag iemand een platte hand naar keuze geven. Deze persoon mag niet tegenstribbelen.");
        }

        buttonNextCard.setText("Confirm that the challenge is done");
        // Inflate the layout for this fragment
        return rootview;
    }

    private View.OnClickListener buttonNextCardListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Navigation.findNavController(v).navigate(R.id.action_FirstFragment_to_SecondFragment);


        }
    };


}
