package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		System.out.println("---SHOW DATA---");

		// 1つ目のオブジェクト
		Member mem1 = new Member();
		mem1.name = "Miura Manabu";
		mem1.age = 24;
		mem1.rank = 1;

		// 2つ目のオブジェクト
		Member mem2 = new Member();
		mem2.name = "Sato Kensuke";
		mem2.age = 36;
		mem2.rank = 2;

		// 表示
		mem1.showMember();
		mem2.showMember();
	}

}
