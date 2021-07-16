import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearch bs = new BinarySearch();
        int result, target;

        System.out.println("Insert the number os elements for the array");
        bs.arrayGenerator(sc.nextInt());
        System.out.print("Generated array: ");
        bs.printer(bs.rndArray);
        System.out.print("Now sorting...\n");
        bs.sorter(bs.rndArray);
        System.out.print("Sorted array: ");
        bs.printer(bs.rndArray);
        System.out.println("Enter the value for the search:");
        target = sc.nextInt();
        result = bs.binarySearch(bs.rndArray, 0, bs.rndArray.length-1,target);
        if (result == -1){
            System.out.println("Cant find the element");
        } else {
            System.out.println("Elemente found at index " + (result+1));
        }
    }
}
