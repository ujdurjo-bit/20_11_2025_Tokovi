import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PrimjerFileInputStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("izlaz.txt");
             FileOutputStream fos = new FileOutputStream( "izlaz2.txt")) {
            int podatak;
            while ((podatak = fis.read()) != -1) {
                System.out.print((char) podatak + " ");
                fos.write(podatak);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
