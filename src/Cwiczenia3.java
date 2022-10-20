import java.util.*;
public class Cwiczenia3 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number- ");
        float firstNumberCichecki= sc.nextFloat();
        System.out.print("Enter second number- ");
        float secondNumberCichecki= sc.nextFloat();


        float dodawanie = firstNumberCichecki+secondNumberCichecki;

        float odejmowanie = firstNumberCichecki-secondNumberCichecki;
        float mnozenie = firstNumberCichecki*secondNumberCichecki;
        float dzielenie = firstNumberCichecki/secondNumberCichecki;
        System.out.print(String.format("Wynik dodawania: "+"%.2f", dodawanie));
        System.out.print(String.format("\n"+"Wynik odejmowania: "+"%.2f", odejmowanie));
        System.out.print(String.format("\n"+"Wynik mnożenia: "+"%.2f", mnozenie));
        System.out.print(String.format("\n"+"Wynik dzielenia: "+"%.2f", dzielenie));

    }
}
