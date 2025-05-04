
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            String items = "";
            for (String item: elements) {
                items+= "\n" + item;
            }
            String elementsWording = elements.size() == 1? " element:" : " elements:";
            return "The collection " + this.name + " has " + this.elements.size() + elementsWording + items;
        }
    }
}
