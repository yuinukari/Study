public class Task implements Displayable {

    private String taskId;
    private String title;
    private String assigneeId;
    private String status;

    public Task(String taskId, String title, String assigneeId, String status) { ... }

    public String getTaskId() { return taskId; }
    public String getTitle() { return title; }
    public String getAssigneeId() { return assigneeId; }
    public String getStatus() { return status; }

    @Override
    public String toDisplayString() {
        return String.format("[%s] %s（%s）", taskId, title, status);
    }
}