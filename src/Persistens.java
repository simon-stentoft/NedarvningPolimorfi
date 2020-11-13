import java.io.FileNotFoundException;
import java.util.Scanner;

public class Persistens {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Velkommen til lageret.");
        Persistens p = new Persistens();
        p.save();
        p.load();

        // https://github.com/andracs/NedarvningPolimorfi/blob/file/src/Persistens.java and Chapter 12.11 in the book
    }
    public void save() throws FileNotFoundException {
        java.io.File file = new java.io.File("Data/Varer.txt");
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.print("Roser ");
        output.println(10);
        output.print("Rødvin ");
        output.println(30);

        output.close();
    }
    public void load() throws FileNotFoundException {
        java.io.File file = new java.io.File("Data/Varer.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String vare = input.next();
            int antal = input.nextInt();
            System.out.println(vare + " " + antal);
        }
        input.close();
    }
}
