import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class KlasaPrintWriter {
    public static void main(String[] args) throws IOException {
        Writer izlaz = new FileWriter( "izlaz2.txt");

        PrintWriter zapis = new PrintWriter(izlaz);
        zapis.println("Prva linija teksta");
        zapis.print("Marko,");
        zapis.print("Juan,");
        zapis.print("Marica.");
        zapis.printf("sdad");
        zapis.close();
    }
}
