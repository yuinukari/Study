public class TaskService {

    private MemberRepository memberRepository;
    private Task[] tasks;
    private int taskCount;

    public boolean addTask(Task task) {
        if (taskCount < tasks.length) {
            tasks[taskCount++] = task;
            return true;
        }
        return false;
    }

    public void printTaskList() {
        System.out.println("===== タスク一覧 =====");
        for (int i = 0; i < taskCount; i++) {
            Task task = tasks[i];
            Member member = memberRepository.findById(task.getAssigneeId());
            if (member != null) {
                System.out.printf("%-30s  担当：%-8s（%s）%n",
                    task.toDisplayString(),
                    member.getMemberName(),
                    member.getRole()
                );
            }
        }
    }

    public void printMemberTaskCount() {
        System.out.println("\n===== 担当タスク数 =====");
        for (int i = 0; i < memberRepository.getCount(); i++) {
            Member m = memberRepository.getAll()[i];
            int count = 0;
            for (int j = 0; j < taskCount; j++) {
                if (tasks[j].getAssigneeId().equals(m.getMemberId())) {
                    count++;
                }
            }
            System.out.printf("%-8s：%d件%n", m.getMemberName(), count);
        }
    }
}