import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearch bs = new BinarySearch();

        System.out.println("Insert the number os elements for the array");
        bs.arrayGenerator(sc.nextInt());
        System.out.print("Generated array: ");
        bs.printer(bs.rndArray);
        System.out.print("Now sorting...\n");

        System.out.print("Sorted array: ");
        bs.printer(bs.rndArray);
    }
}
