MemberRepository memberRepository = new MemberRepository(10);
memberRepository.save(new Member("USR-001", "田中 一郎", "リーダー"));
memberRepository.save(new Member("USR-002", "鈴木 花子", "開発者"));

TaskService service = new TaskService(memberRepository, 20);
service.addTask(new Task("TSK-001", "要件定義書の作成", "USR-001", "完了"));
service.addTask(new Task("TSK-002", "データベース設計", "USR-002", "進行中"));

service.printTaskList();
service.printMemberTaskCount();