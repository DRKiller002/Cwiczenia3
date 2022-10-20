import java.util.*;
public class Zadanie2 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Podaj swój wzrost w metrach ");
        float heightCichecki= sc.nextFloat();
        System.out.print("Podaj swoją wagę w kilogramach ");
        float weightCichecki= sc.nextFloat();

        float BMICichecki = (float) (weightCichecki/ Math.pow(heightCichecki,2));
        if( BMICichecki<16){
            System.out.print(String.format("Twoje BMI: "+"%.2f", BMICichecki));
            System.out.print(" ,wygłodzenie");
            
        } else if (BMICichecki>16 & BMICichecki<16.99) {
            System.out.print(String.format("Twoje BMI: "+"%.2f", BMICichecki));
            System.out.print(" ,wychudzenie");
        } else if (BMICichecki>17 & BMICichecki<18.49) {
            System.out.print(String.format("Twoje BMI: "+"%.2f", BMICichecki));
            System.out.print(" ,niedowaga");
        } else if (BMICichecki>18.50 & BMICichecki<22.99) {
            System.out.print(String.format("Twoje BMI: "+"%.2f", BMICichecki));
            System.out.print(" ,norma niski przedział");
        } else if (BMICichecki>23 & BMICichecki<24.99) {
            System.out.print(String.format("Twoje BMI: "+"%.2f", BMICichecki));
            System.out.print(" ,norma wysoki przedział");
        } else if (BMICichecki>25 & BMICichecki<27.49) {
            System.out.print(String.format("Twoje BMI: "+"%.2f", BMICichecki));
            System.out.print(" ,nadwaga niski przedział");
        } else if (BMICichecki>27.5 & BMICichecki<29.99) {
            System.out.print(String.format("Twoje BMI: "+"%.2f", BMICichecki));
            System.out.print(" ,nadwaga wysoki przedział");
        } else if (BMICichecki>30 & BMICichecki<34.99) {
            System.out.print(String.format("Twoje BMI: "+"%.2f", BMICichecki));
            System.out.print(" ,otyłość I stopnia");
        } else if (BMICichecki>35 & BMICichecki<39.99) {
            System.out.print(String.format("Twoje BMI: "+"%.2f", BMICichecki));
            System.out.print(" ,otyłość II stopnia");
        } else if (BMICichecki>40) {
            System.out.print(String.format("Twoje BMI: "+"%.2f", BMICichecki));
            System.out.print(" ,otyłość III stopnia");
        }
    }
}
