import java.io.*;

public class CitanjeIzDatoteke {
    public static void main(String[] args) throws IOException {
        File ulazniFile = new File("dokument.txt");
        File zapis = new File("kopija.txt");

        zapis.exists();
    /*    FileReader ulaz = new FileReader(ulazniFile);
        FileWriter izlaz = new FileWriter(zapis);
        int c;
        while ((c =ulaz.read()) != -1) {
            izlaz.write(c);

        }
        ulaz.close();
        izlaz.close();*/
//try-with-resource
        try (FileReader ulaz = new FileReader(ulazniFile);
             FileWriter izlaz = new FileWriter(zapis)) {
            int c;
            while ((c =ulaz.read()) != -1)
                izlaz.write(c);
        } catch (IOException e) {
            System.err.println(e);

        }

    }
}
