package Items;

public class Sword extends EquipItem{


	//ドロップした敵に依存して能力値をあげたい
	private String itemName = "ソード";
	private int itemPower = 2;
	private int itemLevel = 2;






	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemName() {
		return this.itemName;
	}

	public void setItemPower(int itemPower) {
		this.itemPower = itemPower;
	}
	public int getItemPower() {
		return this.itemPower;
	}

	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}
	public int getItemLevel() {
		return this.itemLevel;
	}



}
