import java.util.Scanner;
public class Zadania5b {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int k = 10;
            int liczba = 0;
            int najwCichecki = 0;
            int najmCichecki=100;
            while(k > liczba){
                int rand = (int)(Math.random()*100);
                if(rand > najwCichecki){
                    najwCichecki = rand;
                }
                if(rand < najmCichecki){
                    najmCichecki = rand;
                }
                k--;
                System.out.print(rand+" ");
            }

            System.out.println("\nmax is "+najwCichecki);
            System.out.println("min is "+najmCichecki);

        }
    }


