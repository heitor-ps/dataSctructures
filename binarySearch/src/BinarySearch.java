import java.util.Random;
public class BinarySearch {
    private int[] rndArray;

    public int[] getRndArray(){
        return rndArray;
    }

    public void setRndArray(int[] rndArray) {
        this.rndArray = rndArray;
    }

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

    // Função de sorting (insertionSort)
    void sorter(int[] vector){
        int size = vector.length;

        for (int i=0; i<size;i++){
            int target = vector[i];
            int j = i - 1;

            while (j >= 0 && vector[j] > target){
                vector[j+1] = vector[j];
                j-=1;
            }
            vector[j+1] = target;
        }
    }


    // Fazer a partir daqui
    public int binarySearch(int[] vector, int left, int right, int target){

        if (right >= left){
            int mid = left + (right-left)/2;

            if (vector[mid] == target){
                return mid;
            }

            if (vector[mid] > target){
                return binarySearch(vector, left-0, mid - 1,target-0);
            }

            if (vector[mid] < target){
                return binarySearch(vector,mid+1,right-0,target-0);
            }
        }
        return -1;
    }

    void printer(int[] vector){
        int size = vector.length;
        for(int i = 0; i<size;i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
