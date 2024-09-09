import java.util.ArrayList;

public class Container {
    private ArrayList<Todo> container = new ArrayList<>();

    public void addTodo(Todo t) {
        this.container.add(t);
    }

    // Display all the todo's in the container
    public void displayContainer() {
        for (Todo t : this.container) {
            t.displayInfo();
            System.out.println(); // Create a space
        }
    }
}
