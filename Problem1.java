class Problem1{
    public static void main(String[] args) {
        
        // for - loop
        for(int i=1; i<=100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // while - loop
        int j = 1;
        while(j <= 100){
            if(j % 3 == 0 && j % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(j % 3 == 0){
                System.out.println("Fizz");
            } else if(j % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(j);
            }
            j++;
        }

        // palindrome check
        String testString = "racecar";
        findIsPalindrome(testString);
    }

    // recursion
    public static void findIsPalindrome(String s) {
        if(s.length() <= 1){
            System.out.println(s + " is a palindrome");
            return;
        }
        if(s.charAt(0) != s.charAt(s.length() - 1)){
            System.out.println(s + " is not a palindrome");
            return;
        }
        findIsPalindrome(s.substring(1, s.length() - 1));
    }
}