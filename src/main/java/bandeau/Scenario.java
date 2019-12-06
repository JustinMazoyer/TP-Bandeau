/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.*;

/**
 *
 * @author ngoetsch
 */
public class Scenario {

    public String nom;
    public List<Liste_effet> effets = new LinkedList<>();

    public Scenario(String nom) {
        this.nom = nom;
    }

    public void ajoutEffets(Effet effet, int repetition) {
        Liste_effet nouvellelisteffet = new Liste_effet(this, effet, repetition);
        effets.add(nouvellelisteffet);
    }

    public void jouer(Bandeau bandeau) {
        for (Liste_effet e : effets) {
            for (int i = 0; i < e.getRepetition(); i++) {
                e.getEffet().jouerEffet(bandeau);
            }
        }

    }
}
