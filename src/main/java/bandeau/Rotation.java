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
 * @author ngoetsch
 */
public class Rotation extends Scenario {
    
    public void Rotation (Bandeau bandeau){
        bandeau.setMessage("Je fais 2 tours");
                for (int i = 0; i <= 50; i++) {
                    bandeau.setRotation(2*Math.PI*i / 100);
                    bandeau.sleep(100);
        };
    }
}
