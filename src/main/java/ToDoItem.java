public class ToDoItem {
    private string description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
    //constructor
    public ToDoItem(string description) {
        this.description = description;
        this.isDone = false;
    }

    //getters

    public string getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    //setters

    public void setDescription(string description) {
        this.description = description;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }
}