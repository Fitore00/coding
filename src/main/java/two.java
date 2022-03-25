import java.util.Calendar;
import java.util.Scanner;



public class two {
    public static void main(String[] args) {
        System.out.println("Hello there it's me");
        System.out.println("Hello Im writing \"Java Code\" ");
        System.out.println("Crazy!");
        System.out.println("Sot eshte data 04\\03\\2022");
        System.out.println("Java Basics" + "\t Java Advanced" + "\n Kotlin + Android");
        System.out.println("Java Basics");
        System.out.println("Java Android");
        System.out.println("Kotlin" + "Android");
        System.out.println(" \r programming today");
        System.out.println("The wall is \n red");
        System.out.println("Walking \f away");
        System.out.print("hej");
        System.out.println("qkemi");
        System.out.print("red..." + "black");
        System.out.println("tree");
        System.out.println(" \\ Computer Shop 1.1");

        int cope = 5;
        float cmimi = 11.1f * cope;
        System.out.println(" cmimi total" + cmimi);
        boolean sakte = false;
        System.out.println("sakte" + sakte);
        char letter = 'Z';
        System.out.println("shkronja" + letter);


        Scanner input = new Scanner (System.in);

        System.out.println("Shkruaj siperfaqen e katerkendeshitkendrejt: ");
        double brinjaa = input.nextDouble();
        System.out.println("Shkruaj perimetrin e katerkendeshit kenddrejt: ");
        double brinjab = input.nextDouble();
        double perimetri = 2 * brinjaa + 2 * brinjab;
         double siperfaqja = brinjaa * brinjab;
        System.out.println(perimetri);

        int seconds = (int) (0.8765432 * 24 * 60 * 60);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.add(Calendar.SECOND, seconds);

        String result = String.format("%02d:%02d:%02d", cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
        System.out.println(result);

       int minutat = 3456789;
       int dite = 60 * 24;
       int vjet = dite * 365;
        System.out.println( vjet);


















    }
}




