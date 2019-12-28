class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = largest(arr, i + 1, arr.length);
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
    
    private static int largest(int[] arr, int start, int end) {
        int largest = Integer.MIN_VALUE;
        for(int i = start; i < end; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
