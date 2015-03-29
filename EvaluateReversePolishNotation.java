import java.util.ArrayDeque;

/**
 * Created by zibing on 3/29/15.
 */
public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        EvaluateReversePolishNotation s = new EvaluateReversePolishNotation();

        String tokens[] = {"2", "12", "+", "3", "*"};
        System.out.println("\nResult: " + s.evalRPN(tokens));


    }

    public int evalRPN(String[] tokens) {

        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

        for (String token : tokens) {

            if(token.equals("+")) {
                int num2 = stack.removeFirst();
                int num1 = stack.removeFirst();

                stack.addFirst(num1 + num2);

            } else if(token.equals("-")) {
                int num2 = stack.removeFirst();
                int num1 = stack.removeFirst();

                stack.addFirst(num1 - num2);


            } else if(token.equals("*")) {
                int num2 = stack.removeFirst();
                int num1 = stack.removeFirst();

                stack.addFirst(num1 * num2);

            } else if(token.equals("/")) {
                int num2 = stack.removeFirst();
                int num1 = stack.removeFirst();

                stack.addFirst(num1 / num2);

            } else {
                stack.addFirst(Integer.parseInt(token));
            }


        }
        return (stack.peekFirst());
    }
}
