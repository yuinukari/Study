public class Task implements Displayable {
    private String taskId;
    private String title;
    private String assigneeId;
    private String status;

    @Override
    public String toDisplayString() {
        return String.format("[%s] %s（%s）", taskId, title, status);
    }
}