public class App {
    public static void main(String[] args) throws Exception {
        boolean result = isPalindrome("racecar");

        System.out.println(result);

    }


    public  static boolean isPalindrome ( String input){
        if (input.length() == 0 || input.length() == 1) {
            return true;
        }
    
        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrome(input.substring(1, input.length() - 1));
        }
    
        return false;
    }
    
}
