import java.util.ArrayList;
import java.util.List;

class Problem2 {
    public static void main(String[] args) {
        int l1[] = { 1, 2, 3 };
        char l2[] = { 'a', 'b', 'c' };
        System.out.println(twoListsCombiner(l1,l2));
    }

    public static List<String> twoListsCombiner(int[] l1,char[] l2){
        List<String> l3 = new ArrayList<>();
        for (int i = 0; i < l2.length; i++) {
            l3.add(String.valueOf(l1[i]));
            l3.add(String.valueOf(l2[i]));
        }
        return l3;
    }
}
