import java.lang.reflect.Array;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert an integer");
        int[] number = new int[sc.nextInt()];

        for (int j = 1; j <= number.length;j++){
            number[j-1]=j;
        }

        for (int i = 0; i < number.length; i++){
            if (number[i]%15==0){
                System.out.println("fizz buzz at index "+number[i]);
            } else if (number[i]%3==0){
                System.out.println("fizz at index "+number[i]);
            } else if (number[i]%5==0){
                System.out.println("buzz at index "+number[i]);
            }
        }
    }
}
