import java.util.Arrays;

public class MergeSortAlgorithm {
    public static void main(String[] args) {
        int[] times = {40, 53, 18, 22, 34};
        System.out.print("Arreglo original: ");
        PrintArray(times);
        System.out.println("\nArreglo ordenado:");
        MergeSort(times);
        PrintArray(times);
    }

    public static void MergeSort(int[] times){
        if(times.length <= 1) return;
        int half = times.length/2;
        // separa la primera mitad desde el índice cero hasta la mitad del arreglo
        int[] left = Arrays.copyOfRange(times, 0, half);
        // separa la sugunda mitad desde la itad del arreglo hasta la longitud del arreglo
        int[] right = Arrays.copyOfRange(times, half, times.length);
        MergeSort(left);
        MergeSort(right);
        Merge(times, left, right); // combina las mitades ordenadas
    }

    public static void Merge(int[] array, int[] left, int[] right){
        int i = 0;
        int j = 0;

        for(int k = 0; k < array.length;k++){
            if(i >= left.length){
                array[k] = right[j];
                j++;
                continue;
            }
            if(j >= right.length){
                array[k] = left[i];
                i++;
                continue;
            }
            if(left[i] < right[j]){
                array[k] = left[i];
                i++;
            }else{
                array[k] = right[j];
                j++;
            }
        }
    }

    public static void PrintArray(int[] times){
        for(int i = 0;i < times.length;i++){
            System.out.print(times[i] + " ");
        }
    }
}
