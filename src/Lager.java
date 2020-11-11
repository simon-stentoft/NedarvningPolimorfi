import java.util.ArrayList;

public class Lager {
    ArrayList<Varer> vareLager = new ArrayList<Varer>();

    public void fyldtOp() {
        // Første måde
        Rødvin r1 = new Rødvin();
        vareLager.add(r1);
        // Anden måde
        vareLager.add(new Roser());
        vareLager.add(new Pærer());
        vareLager.add(new Apple());
        vareLager.add(new Peas());
    }
    public int antalVarer() {
        return vareLager.size();
    }
    public void visVarer() {
        System.out.println(vareLager);
    }

}
