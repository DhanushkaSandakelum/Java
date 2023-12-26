import java.util.ArrayList;
import java.util.List;

/**
 * Generics: Way of reusing the code on various types of objects while providing compile-time type sagety.
 * @param <T>: T is the type parameter. It is a placeholder for the actual data type that will be specified when the generic is instantiated.
 */
public class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        this.stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if(this.stack.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }

        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int stackSize() {
        return stack.size();
    }
}
