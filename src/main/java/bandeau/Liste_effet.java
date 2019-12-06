/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author jmazoyer
 */
public class Liste_effet {

    Scenario scenario;
    int repetition;
    Effet effet;

    public Liste_effet(Scenario scenario, Effet effet, int repetition) {
        this.scenario = scenario;
        this.effet = effet;
        this.repetition = repetition;
    }

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public int getRepetition() {
        return repetition;
    }

    public void setRepetition(int repetition) {
        this.repetition = repetition;
    }

    public Effet getEffet() {
        return effet;
    }

    public void setEffet(Effet effet) {
        this.effet = effet;
    }

}
