package Main;
	import Characters.Character;

public class Main {

	public static void main(String[] args) {

		String yn ;String Choice;
		Character c = new Character();
		System.out.println("HELLO WORLD");




		System.out.println("あなたの名前を教えてください");
		c.setName(new java.util.Scanner(System.in).nextLine());
		System.out.println(c.getName() + "ですね？");
		//YES or NO = fales
		System.out.println("y/n");
		yn = new java.util.Scanner(System.in).nextLine();
			System.out.println("HELLO WORLD");
			//y or n = false
			while(!(yn.equals("y")||yn.equals("n"))) {
			System.out.println("キーボードのYキーかNキーを押してください");
			System.out.println("y/n");
			yn = new java.util.Scanner(System.in).nextLine();
		}
			while(yn.equals("n")) {
			System.out.println("正しい名前を入力してください。");
			c.setName(new java.util.Scanner(System.in).nextLine());
			System.out.println(c.getName() + "ですね？");
			System.out.println("y/n");
			yn = new java.util.Scanner(System.in).nextLine();
			while(!(yn.equals("y")||yn.equals("n"))) {
				System.out.println("キーボードのYキーかNキーを押してください");
				System.out.println("y/n");
				yn = new java.util.Scanner(System.in).nextLine();
			}
		}

			System.out.println("ようこそ" + c.getName() );
//////////////////////////////////////////////////////////////////



			System.out.println("職業を選んでください。");
			System.out.println("戦士\n");




	}

	}
