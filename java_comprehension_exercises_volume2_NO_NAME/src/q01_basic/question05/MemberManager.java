package q01_basic.question05;

public class MemberManager {

	private MemberManager() {

	}

	public static void showALLMembers(AbstMember[] members) {
		System.out.println("---SHOW MEMBERS---");
		for (AbstMember member : members) {
			member.showMember();
		}
	}

}
