import java.util.Date;

public class Todo {
    private String title;
    private String description;
    private boolean completed;
    private Date date = new Date();

    public Todo() {
        this.title = "No title";
        this.description = "No description";
        // If someone adds a Todo then it shouldn't be already completed
        this.completed = false;
    }

    public Todo(String t, String d) {
        this.title = t;
        this.description = d;
        // If someone adds a Todo then it shouldn't be already completed
        this.completed = false;
    }

    public void displayInfo() {
        System.out.println( "Title: " + this.title + 
                            "\nDescription: " + this.description + 
                            "\nCompleted: " + this.completed +
                            "\nDate: " + this.getDate());
    }

    public String getTitle() { return this.title; }
    public void editTitle(String newTitle) { this.title = newTitle; }

    public String getDescription() { return this.description; }
    public void editDescription(String newDescription) { this.description = newDescription; }

    public boolean getCompleted() { return this.completed; }
    public void toggleCompleted() { this.completed = this.completed ? false : true; }

    private Date getDate() { return date; }
    
}
