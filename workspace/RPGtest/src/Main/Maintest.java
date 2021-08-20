package Main;

import Characters.Character;


public class Maintest {


	public static void main(String[] args)throws Exception{

		String job = null;
		String yn ;//YorN
		String Choice;//選択
		Character c = new Character();
		battle b = new battle();
		battle b1 = new battle();




		//スタート
		do {
			c.setName(Text.start());//名前入力
			yn = Text.ask(c.getName());//確認
			switch(yn){
			case "ｙ":
			case "y":
			case "Y":
			Text.hello(c.getName());//hello
			break;
			case "ｎ":
			case "n":
			case "N":
			Text.error();//再入力
			break;

			default:
		    yn = Text.error();}//再入力

			}while (yn.equals("n"));



		do {

			Choice = Text.menu();//職業選択メニュー

			switch(Choice){
			case "ｗ":
			case "w":
			case "W":
			yn =Text.Warrior();
			job = "w";


			break;
			case "ｍ":
			case "m":
			case "M":
			yn =Text.Magician();



			break;
			case "ｇ":
			case "g":
			case "G":
			yn =Text.Goblin();
			job = "g";
			break;
			default:
			yn = Text.error();
			break;
			}

			}while (yn.equals("n"));




		b.setPc(job);
		b.getPc(job).setName(c.getName());
		b1.setPc("g");

		Text.stats(b.getPc(job).getName(),b.getPc(job).getJob(),
				   b.getPc(job).getHp(),b.getPc(job).getLevel());




		Text.stats(b1.getPc("g").getName(),
				   b1.getPc("g").getHp(),b1.getPc("g").getLevel());



		while (!(0>=b.getPc(job).getHp()||0>=b1.getPc("g").getHp())) {

		Thread.sleep(1000);

		b.getPc(job).attack(b1.getPc("g"));
		Thread.sleep(1000);
		b1.getPc(job).attack(b.getPc(job));



		}

		Text.stats(b.getPc(job).getName(),b.getPc(job).getJob(),
				   b.getPc(job).getHp(),b.getPc(job).getLevel());




		Text.stats(b1.getPc("g").getName(),
				   b1.getPc("g").getHp(),b1.getPc("g").getLevel());


		System.out.println("戦闘終了");


				}











	}





















		// TODO 自動生成されたメソッド・スタブ

		/*
		System.out.println("あなたの名前を教えてください");
		c.setName(new java.util.Scanner(System.in).nextLine());

		System.out.println(c.getName() + "ですね？");
		//YES or NO = fales

		System.out.println("y/n");
		yn = new java.util.Scanner(System.in).nextLine();
*/



		/*
		boolean flag = true;
		while( flag ) {
			System.out.println("あなたの名前を教えてください");
			c.setName(new java.util.Scanner(System.in).nextLine());
			System.out.println(c.getName() + "ですね？");
		while(true) {
			System.out.println("y/n");
			yn = new java.util.Scanner(System.in).nextLine();
			if(yn.equals("y")){
				System.out.println("ようこそ" + c.getName() );
				 flag = false;
				 break;
			}
			else if(yn.equals("n")){
				System.out.println("正しい名前を入力してください。");
				c.setName(new java.util.Scanner(System.in).nextLine());
				System.out.println(c.getName() + "ですね？");
			}
			else {
				System.out.println("キーボードのYキーかNキーを押してください");
			}
		}
		*/

		/*
		SuperHero Sh = new SuperHero();
		Hero h = new Hero();
		PoisonMatango Pa = new PoisonMatango('A');
		Goblin Ga = new Goblin('A');
		Matango Ma = new Matango('A');
		Item i = new Item();
		Sword s = new Sword();
	*/
