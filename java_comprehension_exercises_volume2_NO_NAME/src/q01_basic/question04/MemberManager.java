package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	public static void showALLMembers(Member[] members) {
		for (Member me : members) {
			me.showMember();
		}
	}

}
