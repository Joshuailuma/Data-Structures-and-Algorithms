import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    public Heap(){
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap(){
        return new ArrayList<>(heap); // Return a copy of the list to prevent modification
    }

    private int leftHeap(int index){
        return 2 * index + 1;
    }

    private int rightHeap(int index){
        return 2 * index +2;
    }

    private int parent(int index){
        return (index -1)/2;
    }
    private void swap(int index1, int index2){
        int temp = heap.get (index1);
        heap.set (index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value){
        heap.add(value);
        int current = heap.size()-1;

        while (current > 0 && heap.get(current) > heap.get(parent(current))){
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public Integer remove(){
        if(heap.isEmpty()){
            return null;
        }

        if(heap.size() == 1){
           return heap.remove(0);
        }

       int maxValue = heap.get(0);
        heap.set(0, heap.size() - 1);
        sinkDown(0);
        return  maxValue;
    }

    private void sinkDown(int index) {
        int current = heap.get(0);
        while (index < heap.size() && heap.indexOf(current) < heap.indexOf(current) + 1){
            current = heap.get(heap.indexOf(current) + 1);
            swap(heap.indexOf(current), heap.indexOf(current) + 1);
        }
    }
}