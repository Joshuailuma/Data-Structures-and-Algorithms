import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class HashTable{
    private int size = 7;
    private Node[] dataMap;

    class Node{
        String key;
        int value;
        Node next;

        public Node(String key, int value){
            this.key = key;
            this.value = value;
        }

    }

    public HashTable(){
        dataMap = new Node[size];
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    public int hash(String key){
        int hash = 0;
        char[] keyCharArray = key.toCharArray();
        for (int i = 0; i < keyCharArray.length; i++ ){
            int ascii = keyCharArray[i];
            hash = (hash + ascii * 23) %dataMap.length; // will give a value between 0 - 6
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            if (temp.key == key) {
                temp.value += value;
                return;
            }
            while (temp.next != null) {
                temp = temp.next;
                if (temp.key == key) {
                    temp.value += value;
                    return;
                }
            }
            temp.next = newNode;
        }
    }

    public boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < array1.length; i++){
            hashMap.put(i, array1[i]);
        }

        for (int j =0; j < array2.length; j++){
            if(hashMap.containsValue(array2[j])){
                return true;
            }
           hashMap.put(j, array1[j]);
        }
        return false;
    }
    public List<Integer> findDuplicates(int[] array){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> finalArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if(hashMap.containsValue(array[i])){
                finalArray.add(array[i]);
            }
            hashMap.put(i,array[i]);
        }
        return finalArray;
    }
}
