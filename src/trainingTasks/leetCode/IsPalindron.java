package trainingTasks.leetCode;

public class IsPalindron {
        public static boolean isPalindrome(int x) {

            String newString = Integer.toString(x);
            String reverseString = "";


            for(int i = newString.length() -1; i >= 0; i--) {
                reverseString = reverseString + newString.charAt(i);
            }

            if(newString.equals(reverseString)) {
                return true;
            }

            return false;
        }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
