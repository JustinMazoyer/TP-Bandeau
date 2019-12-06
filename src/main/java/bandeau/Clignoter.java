/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author jmazoyer
 */
public class Clignoter extends Effet {

    public void jouerEffet(Bandeau bandeau) {
        bandeau.setMessage("Je clignote 10x");
        for (int i = 1; i < 11; i += 1) {
            int nombre = i % 2;
            if (nombre == 0) {
                bandeau.setForeground(Color.WHITE);
                bandeau.sleep(100);
            } else {
                bandeau.setForeground(Color.BLACK);
                bandeau.sleep(100);
            }
        }
    }

}
