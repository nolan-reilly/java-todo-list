public class Todo {
    private String title;
    private String description;
    private boolean completed;

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
        System.out.println("Title: " + this.title + "\nDescription: " + this.description + "\nCompleted: " + this.completed);
    }


    public void toggleCompleted() {
        if (this.completed) {
            this.completed = false;
        } else {
            this.completed = true;
        }
    }

    public String getTitle() { return this.title; }
    public String getDescription() { return this.description; }
    public boolean getCompleted() { return this.completed; }
    
}
