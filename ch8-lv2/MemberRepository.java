public class MemberRepository {

    private Member[] members;
    private int count;

    public void save(Member member) {
        if (count < members.length) {
            members[count++] = member;
        }
    }

    public Member findById(String memberId) {
        for (int i = 0; i < count; i++) {
            if (members[i].getMemberId().equals(memberId)) {
                return members[i];
            }
        }
        return null;
    }

    public int getCount() { return count; }
    public Member[] getAll() { return members; }
}