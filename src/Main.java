import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Unesi podatak! ");
        String podatak = br.readLine();
        System.out.println("Podatak je: " + podatak);*/

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Unesi podatak! ");
            String podatak = br.readLine();
            System.out.println("Podatak je: " + podatak);

        } catch (Exception e) {
            throw new RuntimeException();
        }


    }
}
