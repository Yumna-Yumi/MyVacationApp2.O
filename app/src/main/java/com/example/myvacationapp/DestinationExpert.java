package com.example.myvacationapp;

import java.util.ArrayList;
import java.util.List;

public class DestinationExpert {
    List<String> getSpot(String spot) {
        List<String> Spot = new ArrayList<>();
        if (spot.equals("Chattagram")) {
            Spot.add("Patenga");
            Spot.add("Bhatiary");
            Spot.add("Sitakunda");
        } else if(spot.equals("Coxs Bazar")) {
            Spot.add("Laboni Beach");
            Spot.add("Inani Beach");
            Spot.add("Sugondha");
        }
        else {
            Spot.add("Ratargul");
            Spot.add("Shada Pathor");
            Spot.add("Bisnakandi");
        }
        return Spot;
    }

}
