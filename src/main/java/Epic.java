public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    public String[] search(String query) {
        String[] result = new String[0];
        for (String string : subtasks) {
            if (string.matches(query)) {
                result = search(string);
            }
        }
        return result;
    }
}