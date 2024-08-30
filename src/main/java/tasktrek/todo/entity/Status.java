package tasktrek.todo.entity;

public enum Status {
    TODO("Todo"),
    IN_PROGRESS("In-Progress"),
    DONE("Done"),
    CANCELED("Canceled");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}

