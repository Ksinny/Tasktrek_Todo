package tasktrek.todo.entity;

public enum Label {
    BUG("Bug"),
    FEATURE("Feature"),
    ENHANCEMENT("Enhancement"),
    DOCUMENTATION("Documentation");

    private final String label;

    Label(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

