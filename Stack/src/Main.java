import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    /**
     * Please uncomment the titles you want to try
     */
    public static void main(String[] args) {

        // =====PUSH TO STACK
//        Stack newStack = new Stack(1);
//        newStack.push(3);
//        newStack.push(4);
//        newStack.printList();

        // USING ARRAY AS A STACK
//        StackUsingArray stackUsingArray = new StackUsingArray();
//        stackUsingArray.push(23);
//        stackUsingArray.push(24);
//        stackUsingArray.push(25);
//        stackUsingArray.printArray();
//        System.out.println("Popping");
//        stackUsingArray.pop();
//        System.out.println("========");
//        stackUsingArray.printArray();

        //===== REVERSE A STRING
//        System.out.println(reverse("Happy"));

        //===== IS BALANCED
        System.out.println(isReallyBalanced("(((0))"));

    }

    public static String reverse(String word) {
        ArrayList<Character> stringArrayList = new ArrayList<>();
        for (int i = word.length(); i > 0; i--) {
            stringArrayList.add(word.charAt(i - 1));
        }
        return stringArrayList.stream().map(Object::toString)
                .collect(Collectors.joining());

    }

//By "balanced," we mean that for every open parenthesis, there is a matching closing parenthesis in the correct order. For example, the string "((()))" has three pairs of balanced parentheses, so it is a balanced string. On the other hand, the string "(()))" has an imbalance, as the last two parentheses do not match, so it is not balanced.  Also, the string ")(" is not balanced because the close parenthesis needs to follow the open parenthesis.
    public static boolean isReallyBalanced(String word){
        int notBalanced = 0;
        int balanced = 0;
        for (int i = 0; i < word.length()/2; i++){

            if((word.charAt(i) == '(') && ((word.charAt(word.length() - 1-1)) == ')')){
                balanced ++;
            } else {
                notBalanced ++;
            }
        }
        if (notBalanced == 0 && word.length()%2 == 0 ){
            return true;
        }
         return false;
    }
}
