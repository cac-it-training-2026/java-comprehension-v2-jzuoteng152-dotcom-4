package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		System.out.println("---SHOW DATA---");

		Member member = new Member();

		member.setName("Miura Mnabu");
		member.setAge(30);
		member.setRank(1);

		member.showMember();

		System.out.println(">>>RANK UP>>>");

		member.rankUp();

		System.out.println("---GET RANK---");

		System.out.println("newRank:" + member.getRank());

	}
}
