public class Main {
    // Creating a Todo class which stores a title, description and wether its completed or not

    // Have some interface in the console with the following tasks
    // - Give the user functionality (Add, Remove, Edit) Todo's
    // - Display all the current Todo's
    
    public static void main(String args[]) {
        Todo t1 = new Todo();
        Todo t2 = new Todo("Random Title", "Trash description");
        
        Container c = new Container();

        c.addTodo(t1);
        c.addTodo(t2);

        c.displayContainer();
    }
}