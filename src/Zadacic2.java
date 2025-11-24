/*//dodajte poruku tipa daotteka kreirana + naziv
            Provjeriti postoji li datoteka XY
                    Ako postoji datoteka, obrisati ju*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Zadacic2 {
    public static void main(String[] args) {
        File datoteka = new File("izlaz2.txt");
        if (datoteka.exists()) {
            datoteka.delete();
            System.err.println("Datoteka je obrisana!");
        } else {
            System.err.println("Dogodila se greška pri brisanju!");

        }


        try (FileInputStream fis = new FileInputStream("izlaz.txt");
             FileOutputStream fos = new FileOutputStream("izlaz2.txt")) {
            int podatak;
            while ((podatak = fis.read()) != -1) {
                System.out.print((char) podatak + " ");
                fos.write(podatak);
            }

            System.out.println("\n Datoteka izlaz2.txt je uspješno kreirana!");


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}