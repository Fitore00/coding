import java.util.Random;
import java.util.Scanner;

public class Ushtrime33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sheno nr e oreve:");
        int ora = input.nextInt();
        int i = ora * 60;
        System.out.println(ora+ " ore jane" +i+ "minuta");


        System.out.print("Sheno nr e minutave");
        int minutat = input.nextInt();
        int m = minutat / 1440;
        System.out.println(minutat+ "gjithsej jane" +m+ "dite");


        double minutesInyear = 60 * 24 * 365;
        System.out.println("Nr of minutes:");
        double min = input.nextDouble();
        int years = (int) (min/minutesInyear);
        System.out.println((int)min+ "minutes are" +years+ "years");







    }

}

