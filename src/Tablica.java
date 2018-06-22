import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("tablica.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bfw = new BufferedWriter(fileWriter);
        System.out.println("ile liczb chcesz wczytac?");
        int wielkoscTablicy = scanner.nextInt();
        double[] tab = new double[wielkoscTablicy];

        for (int i = 0; i < tab.length; i++) {
            System.out.println("podaj " + (i + 1) + " liczbe zmiennoprzecinkowa");
            double warttosc = scanner.nextDouble();
            tab[i] = warttosc;
            bfw.write(String.valueOf(tab[i] + " "));
        }
        bfw.close();
        System.out.println(Arrays.toString(tab));


    }


}
