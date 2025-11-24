import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
/*Korištenjem klase BufferedReader učitaj nekoliko informacija od korisnika kroz konzolu.
Informacije koje si učitao zapiši u novu datoteku „nazivPoŽelji.txt”
Stvori kopiju datoteke pod nazivom „kopijaNaziv.txt”
Po želji iskoristi dodatno oblikovanje znakova. */

public class Zadacic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> podaci = new ArrayList<>();

        try {
            System.out.println("Unesi 5 podataka:");

            int i = 0;
            while (i < 5) {
                System.out.print("Podatak " + (i + 1) + ": ");
                String unos = br.readLine();
                podaci.add(unos);
                i++;
            }
        } catch (IOException e) {
            System.out.println("Greška: " + e.getMessage());


        }
        br.close();

        try (Writer izlaz = new FileWriter("nazivPoŽelji.txt")) {
            for (String podatak : podaci) {
                izlaz.write(podatak + "\n");

            }
        } catch (IOException e) {
            System.out.println("Greška pri pisanju: " + e.getMessage());
        }
        File ulazniFile = new File("nazivPoŽelji.txt");
        File zapis = new File("kopijaNaziv.txt");


        try (FileReader ulaz = new FileReader(ulazniFile);
             FileWriter izlaz = new FileWriter(zapis)) {
            int j;
            while ((j = ulaz.read()) != -1) {
                izlaz.write(Character.toUpperCase((char) j));
            }

        } catch (IOException e) {
            System.out.println("Greška pri kopiranju: " + e.getMessage());
        }
    }


}


