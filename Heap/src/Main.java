import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    /**
     * Please uncomment the titles you want to try
     */
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(58);
        heap.insert(72);
        heap.insert(61);
        heap.insert(91);
        System.out.println(heap.getHeap());
        System.out.println("-------------------");
        heap.remove();
        System.out.println(heap.getHeap());
    }
}
