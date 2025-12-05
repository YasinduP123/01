class Problem3 {
    public static void main(String[] args) {
        int n = 100;
        int t1 = 0, t2 = 1;
        System.out.print("Fibonacci Series: " + t1 + ", " + t2);
        for (int i = 2; i < n; ++i) {
            int t3 = t1 + t2;
            if (i == n - 1) {
                System.out.print(" and " + t3);
            } else {
                System.out.print(", " + t3);
            }
            t1 = t2;
            t2 = t3;
        }
    }
}