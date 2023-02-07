import java.util.Scanner;

public class Ejercicio8 {
    //Variable are declared to find the number of student per floor
    static int floor(int st, int cap, int flo) {

        int capt = (cap*flo);
        int numFloor = (int) Math.ceil((st/capt));
        return numFloor;
    }

    //Variable are declared to find the number of classrooms
    static int classrooms(int st, int cap, int flo) {

        int capt = (cap*flo);
        int numclass = (int)Math.ceil(((st/capt)*flo));
        return numclass;
    }

    public static void main(String[] args) {
        //read keyboard information
        Scanner teclado = new Scanner(System.in);
        //Program Variables
        int st, cap, flo, numFloor, numclass;

        //students Variable
        System.out.print("How many students are there at EAN? ");
        st = teclado.nextInt();

        //classrooms Variable
        System.out.print("What is the capacity of a classroom? ");
        cap = teclado.nextInt();

        //Variable rooms per floor
        System.out.print("How many rooms are there per floor? ");
        flo = teclado.nextInt();


        //Function
        numFloor = floor(st, cap, flo);
        numclass = classrooms(st, cap, flo);


        //Print
        System.out.println("The number of floors for the number of students must be : " + numFloor);
        System.out.println("The total number of classrooms are : " + numclass);

    }



}
