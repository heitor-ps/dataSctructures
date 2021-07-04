import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] numbers = {1,42,51,21,3,5,6,2,79,12,4,2,42,461,36,24,24,2362,4,41242114,52,2463};
        int i = 1;
        int swap = 1;
        int aux;

        //buble sort aprimorado
        while (i<=numbers.length && swap == 1){
            swap = 0;
            for (int j = 0; j <= numbers.length-2; j++){
                if (numbers[j] > numbers[j + 1]){
                    swap = 1;
                    aux = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux;
                }
            }
            i++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
