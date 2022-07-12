package M03_Functions_and_Arrays;

public class ArraySwap {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 65;
        arr[3] = 69;
        arr[4] = 98;

        swap(arr, 0, 4);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
