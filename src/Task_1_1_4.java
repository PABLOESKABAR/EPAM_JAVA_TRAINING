import java.util.Scanner;

public class Task_1_1_4 {
    public static void main(String[] args) {
        System.out.println("Enter R(nnn.ddd)");
        double r = 456.789;
        double z = Math.floor(r);
        double k = Math.round((r - z)*1000)+(z/1000);
        System.out.println(k);
    }
}
