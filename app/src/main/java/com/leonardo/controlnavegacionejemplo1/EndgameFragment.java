package com.leonardo.controlnavegacionejemplo1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EndgameFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EndgameFragment extends Fragment {

    public EndgameFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_endgame, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);
        Button boton = view.findViewById(R.id.restartGameBoton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //navController.navigate(R.id.action_endgameFragment_to_startFragment);
                NavOptions navOptions = new NavOptions.Builder().setPopUpTo(R.id.startFragment, true).build();
                navController.navigate(R.id.action_endgameFragment_to_startFragment, null, navOptions);

            }
        });



    }
}