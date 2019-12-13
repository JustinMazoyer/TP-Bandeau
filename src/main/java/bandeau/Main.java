package bandeau;

public class Main {

    public static void main(String[] args) {
        Bandeau bandeau = new Bandeau();
        Rotation rotation = new Rotation();
        Clignoter clignoter = new Clignoter();
        Zoom zoom = new Zoom();
        Teletype teletype = new Teletype();
        Scenario Jul = new Scenario();
        Jul.ajoutEffets(rotation, 2);
        Jul.ajoutEffets(clignoter, 1);
        Jul.ajoutEffets(zoom, 1);
        Jul.ajoutEffets(teletype, 1);
        Jul.jouer(bandeau);

    }
}
