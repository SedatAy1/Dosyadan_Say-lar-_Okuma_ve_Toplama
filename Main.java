import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "dosya.txt";
        int toplam = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                int sayi = Integer.parseInt(line);
                toplam += sayi;
            }
            System.out.println("Dosyadaki tüm sayıların toplamı: " + toplam);
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}