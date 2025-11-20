import java.io.*;

public class ZapisUDatoteku {
    public static void main(String[] args) throws IOException {
        Reader ulaz = new StringReader("abcderf");
        Writer izlaz = new FileWriter("izlaz.txt");
        int nextChar;
        while ((nextChar = ulaz.read()) != -1) {
            izlaz.write(Character.toUpperCase(nextChar));

        }
//        izlaz.flush();
        izlaz.close();


    }
}
