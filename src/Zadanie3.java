import java.util.Scanner;

public class Zadanie3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj a ");
        float aCichecki = sc.nextFloat();
        //float aCichecki= sc.nextFloat();
        //if (aCichecki==0){
        //   System.out.println("a nie może być równe 0, podaj a ponownie");
       // }


        System.out.print("Podaj b ");
        float bCichecki = sc.nextFloat();
        System.out.print("Podaj c ");
        float cCichecki = sc.nextFloat();

        float deltaCichecki;
        deltaCichecki= (float) Math.pow(bCichecki,2)-4* aCichecki * cCichecki;
        if (deltaCichecki<0){
            System.out.println("Brak rozwiązań");
        }
        else
            if (deltaCichecki==0){
                float jednorozw;
                jednorozw= -bCichecki/(2*aCichecki);
                System.out.print("Jedno podwójne rozwiązanie x =" + jednorozw);
            }
        else
            {
                float dwarozwx1, dwarozwx2;
                dwarozwx1= (float) (-bCichecki+Math.sqrt(deltaCichecki))/(2*aCichecki);
                dwarozwx2= (float) (-bCichecki-Math.sqrt(deltaCichecki))/(2*aCichecki);
                System.out.print(String.format("Dwa rozwiązania: x1 ="+"%.2f" , dwarozwx1));
                System.out.print(String.format("\n"+"Dwa rozwiązania: x2 ="+"%.2f", dwarozwx2));
            }
    }
}