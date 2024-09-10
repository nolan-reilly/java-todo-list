import java.util.ArrayList;

public class Container {
    private ArrayList<Todo> container = new ArrayList<>();

    public void addTodo(Todo t) { this.container.add(t); }
    public void removeTodo(int index) { this.container.remove(index); }

    // Todo: Make text flush to the right after describing the index

    // Display all container todo data
    public void displayContainer() {
        for (int i = 0; i < containerSize(); i++) {
            System.out.println("Index: " + i);
            container.get(0).displayInfo();
            System.out.println(); // Output an empty line
        }
    }

    // Return the size of the container
    private int containerSize() { return this.container.size(); }
    
    // Don't worry about this until later
    // Todo: Create function to Sort container by date
}
