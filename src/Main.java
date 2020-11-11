import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Main {

    public static void main(String[] args) {

        Apple a = new Apple();
        a.stykpris = 2;
        a.holdbarhed = new Date(1608768000);
        a.smidUd();
        a.moden = true;
        a.coolDown();
        if (a.moden == true)
            System.out.println("Æble: pris pr. styk: " + a.stykpris + ".");
        else
            System.out.println(a + " er ikke modne.");


        Peas p = new Peas();
        p.stykpris = 0.1;
        p.holdbarhed = new Date(1608768000);
        p.freeze();

        Pærer pp = new Pærer();
        pp.stykpris = 3;
        pp.holdbarhed = new Date(1608768000);
        pp.coolDown();
        pp.moden = false;
        if (pp.moden == true)
            System.out.println("Æble: pris pr. styk: " + pp.stykpris + ".");
        else
            System.out.println(pp + " er ikke modne.");

        Rødvin r = new Rødvin();
        r.stykpris = 500;
        r.holdbarhed = new Date(1608768000);
        r.alder = 30;
        r.mærke = "Valpolicella";

        Roser o = new Roser();
        o.stykpris = 40; //Pr. buket med 6.
        o.antalIBuket = 6;
        o.farve = "Rød";

        Lager lager = new Lager();
        lager.antalVarer();
        lager.visVarer();
    }
}
