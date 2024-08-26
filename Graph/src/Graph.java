import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjListMap = new HashMap<>();

    public void printGraph() {
        System.out.println(adjListMap);
    }
    public boolean addVertex(String vertex) {
        if(adjListMap.get(vertex) == null){
            adjListMap.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2){
        if((adjListMap.get(vertex1) != null) && (adjListMap.get(vertex2) != null)){
            adjListMap.get(vertex1).add(vertex2);
            adjListMap.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }
    public boolean removeEdge(String vertex1, String vertex2){
        if((adjListMap.get(vertex1) != null) && (adjListMap.get(vertex2) != null)){
            adjListMap.get(vertex1).remove(vertex2);
            adjListMap.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex) {
        if (adjListMap.get(vertex) != null) return false;
        for (String otherVertex: adjListMap.get(vertex)){
            adjListMap.get(otherVertex).remove(vertex);
        }
        adjListMap.remove(vertex);
        return true;
    }
    }