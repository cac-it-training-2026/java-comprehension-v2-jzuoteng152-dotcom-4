package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		System.out.println("---SHOW DATA()---");
		Member me1 = new Member();
		me1.showMember();

		System.out.println("---SHOW DATA(Miura)---");
		Member me2 = new Member("Miura Manabu", 28, 2);
		me2.showMember();

	}

}
