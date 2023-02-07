import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Ejercicio11 {
    //Variable are declared tens
    static String tens(int a) {

        if (a == 1){
            String resul = "X";
            return resul;
        } else if (a == 2){
            String resul = "XX";
            return resul;
        }else if (a == 3){
            String resul = "XXX";
            return resul;
        }else if (a == 4){
            String resul = "XL";
            return resul;
        }else if (a == 5){
            String resul = "L";
            return resul;
        }else if (a == 6){
            String resul = "LX";
            return resul;
        }else if (a == 7){
            String resul = "LXX";
            return resul;
        }else if (a == 8){
            String resul = "LXXX";
            return resul;
        }else if (a == 9){
            String resul = "XC";
            return resul;
        }else {
            String resul = "";
            return resul;
        }

    }


    //Variable are declared unit
   static String unit(int a) {

        if (a == 1){
            String resul = "I";
            return resul;
        } else if (a == 2){
            String resul = "II";
            return resul;
        }else if (a == 3){
            String resul = "III";
            return resul;
        }else if (a == 4){
            String resul = "IV";
            return resul;
        }else if (a == 5){
            String resul = "V";
            return resul;
        }else if (a == 6){
            String resul = "VI";
            return resul;
        }else if (a == 7){
            String resul = "VII";
            return resul;
        }else if (a == 8){
            String resul = "VIII";
            return resul;
        }else if (a == 9){
            String resul = "IX";
            return resul;
        }else {
            String resul = "";
            return resul;
        }
    }


    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        int a;
        String dece, unid;

        //a Variable
        System.out.print("Enter a number ");
        a = teclado.nextInt();


        //Function
        dece = tens((a/10 %10));
        unid = unit(a %10);



        //Print
        System.out.println("Decimal number: "+a + " Roman number: "+ dece+unid);

    }

}
