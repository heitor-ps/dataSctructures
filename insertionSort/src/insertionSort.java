public class insertionSort {

    void  sorter(int[] vector){
        int size = vector.length;

        for(int i = 1; i < size;i++){
            int target = vector[i];
            int j = i - 1;

            while(j >= 0 && vector[j] > target){
                vector[j+1] = vector[j];
                j-=1;
            }
            vector[j+1] = target;
        }
    }

    void printer(int[] vector){
        int size = vector.length;
        for (int i = 0; i < size ; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12,11,13,5,6};

        insertionSort is = new insertionSort();

        is.sorter(array);
        is.printer(array);

    }
}
