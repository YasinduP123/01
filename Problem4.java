import java.util.Arrays;

class Problem4 {
    public static void main(String[] args) {
        int[] arr = {50,2,1,9};
        System.out.println(arrangeLargestValue(arr));
    }
    public static int arrangeLargestValue(int[] arr) {
        String[] strArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(strArr, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder largestValueStr = new StringBuilder();
        for (String numStr : strArr) {
            largestValueStr.append(numStr);
        }
        return Integer.parseInt(largestValueStr.toString());
    }
}
