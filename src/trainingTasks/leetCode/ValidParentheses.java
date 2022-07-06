package trainingTasks.leetCode;

public class ValidParentheses {

    public boolean isValid(String s) {

        boolean ifTrue = true;

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(') {
                ifTrue = s.charAt(i + 1) == ')';
            }

            if(s.charAt(i) == '{') {
                ifTrue = s.charAt(i + 1) == '}';
            }

            if(s.charAt(i) == '[') {
                ifTrue = s.charAt(i + 1) == ']';
            }

            if(!ifTrue) {
                break;
            }
        }
        return ifTrue;
    }

    public static void main(String[] args) {
        String s = "[][]()";
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid(s));
    }
}
