import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
    //Variable are declared to find the older person
    static String dats(String name1,String name2, String name3, int age1, int age2, int age3) {

        if (age1 > age2){
            if (age1 > age3){
                return name1;
            }else {
                return name3;
            }
        } else if (age2 > age3) {
            return name2;
        }else {
            return name3;
        }

    }

    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        int age1, age2, age3;
        String name1, name2, name3, name;


        //Variables
        System.out.print("Enter the name of one of your siblings: ");
        name1 = teclado.next();

        System.out.print("Now enter the age of "+name1+": ");
        age1 = teclado.nextInt();

        System.out.print("Enter the name of one of your siblings: ");
        name2 = teclado.next();

        System.out.print("Now enter the age of "+name2+": ");
        age2 = teclado.nextInt();

        System.out.print("Enter the name of one of your siblings: ");
        name3 = teclado.next();

        System.out.print("Now enter the age of "+name3+": ");
        age3 = teclado.nextInt();


        //Function
        name = dats(name1,name2,name3,age1,age2,age3);

        //Print
        System.out.println("of the siblings, the eldest is: "+ name);
    }

}
