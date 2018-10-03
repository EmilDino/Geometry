import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("indtast breddegrad og længdegrad");
        System.out.print("indæst x1");
        double x1 = input.nextDouble();
        System.out.print("indsæt y1");
        double y1 = input.nextDouble();
        System.out.print("indsæt x2");
        double x2 = input.nextDouble();
        System.out.print("indsæt y2");
        double y2 = input.nextDouble();

        double radiansx1 = Math.toRadians(x1);
        double radiansy1 = Math.toRadians(y1);
        double radiansx2 = Math.toRadians(x2);
        double radiansy2 = Math.toRadians(y2);

        double distance = 6371.01 * Math.acos(Math.sin(radiansx1) *
                Math.sin(radiansx2) + Math.cos(radiansx1) * Math.cos(radiansx2) * Math.cos(radiansy1 - radiansy2));
        System.out.println(distance);
    }
}
