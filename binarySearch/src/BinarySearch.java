import java.util.Random;
public class BinarySearch {
    int[] rndArray;
    public int randomizer(){
        Random rd = new Random();
        int upper = 250;
        int int_random = rd.nextInt(upper);
        return int_random;
    }

    public  void arrayGenerator(int value){
        rndArray = new int[value];
        for (int i = 0; i < value; i++){
            rndArray[i] = randomizer();
        }
    }
    // Fazer a partir daqui

    void printer(int[] vector){
        int size = vector.length;
        for(int i = 0; i<size;i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
