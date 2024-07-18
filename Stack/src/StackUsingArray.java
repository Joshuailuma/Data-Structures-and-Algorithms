import java.util.ArrayList;

public class StackUsingArray<T> {
    ArrayList<T> stackArray = new ArrayList<T>();

    public ArrayList<T> getStackArray() {
        return stackArray;
    }

    public void printArray() {
        for (int i =0; i < stackArray.size(); i++ ){
            System.out.println(stackArray.get(i));
        }
    }

    public boolean isEmpty() {
        return stackArray.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackArray.get(getStackArray().size() - 1);
        }
    }

    public void push(T value) {
        stackArray.add(value);
    }
    public T pop() {
        return stackArray.remove(getStackArray().size()-1);
    }


}
