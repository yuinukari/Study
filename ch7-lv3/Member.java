public class Member implements Displayable {

    private String memberId;
    private String memberName;
    private String role;

    public Member(String memberId, String memberName, String role) { ... }

    public String getMemberId() { return memberId; }
    public String getMemberName() { return memberName; }
    public String getRole() { return role; }

    @Override
    public String toDisplayString() {
        return String.format("[%s] %s（%s）", memberId, memberName, role);
    }
}
