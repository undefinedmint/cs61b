package reading3;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr, 0);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static int findSmallestIdx(int[] arr, int startIdx) {
        int smallestIdx = startIdx;
        for (int i = startIdx; i < arr.length; i++) {
            if (arr[i] < arr[smallestIdx]) {
                smallestIdx = i;
            }
        }
        return smallestIdx;
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 递归实现选择排序，每排序一次，只用排剩余部分的数组
    public static void selectionSort(int[] arr, int startIdx) {
        if (startIdx >= arr.length - 1) return;
        int smallest = findSmallestIdx(arr, startIdx);
        swap(arr, startIdx, smallest);
        selectionSort(arr, startIdx + 1);
    }

}


