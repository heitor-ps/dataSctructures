public class selectionSort {
    void swap(int[] vector, int i, int j){
        int aux = vector[i];
        vector[i] = vector[j];
        vector[j] = aux;
    }
    void sorter(int[] vector){
        int size = vector.length;
        for (int i = 0; i < size-1; i++){
            int indexTarget = i;

            for (int j = i + 1; j < size;j++){
                if (vector[j] < vector[indexTarget]){
                    indexTarget = j;
                }
            }
            swap(vector,indexTarget,i);
        }

    }
    void printer(int[] vector){
        int size = vector.length;
        for(int i = 0; i < size;i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        selectionSort ss = new selectionSort();
        int[] vector = {64,25,12,22,11};
        System.out.print("\nReceived array: ");
        ss.printer(vector);
        ss.sorter(vector);
        System.out.print("\nResult: ");
        ss.printer(vector);
    }
}