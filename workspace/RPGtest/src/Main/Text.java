package Main;

public class Text {






		//再入力
	public static String error() throws Exception{

		System.out.println("正しく入力してください。");
		return "n";
	}



		// TODO 自動生成されたメソッド・スタブ


		//スタートメニュー
	public static String start() throws Exception{

		System.out.println("あなたの名前を入力してください↴");
		return (new java.util.Scanner(System.in).nextLine());

	}


		//名前確認
	public static String ask(String name)throws Exception{
		System.out.println(name + "ですね？");
		System.out.println("y/n ↴");
		return (new java.util.Scanner(System.in).nextLine());

	}

		//Hello
	public static void hello(String name)throws Exception{
		System.out.println("ようこそ" + name);
		Thread.sleep(1000);


	}


		//職業メニュー
	public static String menu() throws Exception{
		System.out.println("職業を選んでください。↴");
		Thread.sleep(1000);
		System.out.println("Warrior  →【W】");
		System.out.println("高い体力で安定した戦闘が可能。");
		System.out.println("Magician →【M】");
		System.out.println("体力は低いが攻撃の威力が高い");
		Thread.sleep(1000);
		System.out.println("頭文字をキーボードで入力してください。↴");
		Thread.sleep(1000);


		return  (new java.util.Scanner(System.in).nextLine());
}






		//職業確認戦士
	public static String Warrior() throws Exception{

		System.out.println("Warriorで始めます。よろしいですか？");
		Thread.sleep(1000);
		System.out.println("y/n ↴");

		return  (new java.util.Scanner(System.in).nextLine());


	}



		//職業確認魔法使い
	public static String Magician() throws Exception{

		System.out.println("Magicianで始めます。よろしいですか？");
		Thread.sleep(1000);
		System.out.println("y/n ↴");
		return  (new java.util.Scanner(System.in).nextLine());
	}




		//ゴブリン確認
	public static String Goblin() throws Exception{

		System.out.println("Goblinで始めます。よろしいですか？");
		Thread.sleep(1000);
		System.out.println("y/n ↴");


		return  (new java.util.Scanner(System.in).nextLine());
	}






	//最終確認

	public static String stats(String name ,String job,int hp,int level) throws Exception{

		System.out.println("名前【" + name
				+ "】職業【"
				+ job
				+ "】HP【"
				+ hp
				+ "】レベル【"
				+ level
				+ "】");

		return null;


	}



	public static String stats(String name ,int hp,int level) throws Exception{

		System.out.println("名前【" + name
				+ "】HP【"
				+ hp
				+ "】レベル【"
				+ level
				+ "】");

		return null;


	}





































	}


