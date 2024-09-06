package com.jeido.exercice4;


import com.jeido.exercice4.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class RechercheVille {
    private final List<String> villes;

    public RechercheVille(List<String> villes) {
        this.villes = villes;
    }

    public List<String> Rechercher(String mot)  {

        if (mot.equals("*")) return villes;

        if (mot.length() < 2) {
            throw new NotFoundException("Pas assez de lettre pour la recherche");
        }

        List<String> resultat = new ArrayList<String>();
        for (String ville : villes) {
            if (ville.toLowerCase().contains(mot.toLowerCase())) {
                resultat.add(ville);
            }
        }

        return resultat;
    }
}
