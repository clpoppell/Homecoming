package gods_and_mages_engine.Player_Char;

public class CharRace extends Characteristic{
	//region Variables
	private int strMod;
	private int staMod;
	private int agiMod;
	private int speedMod;
	//endregion
	
	public CharRace(String name, String desc, String[] traitsGranted, String[] abilitiesGranted,
					int strMod, int staMod, int agiMod, int speedMod){
		super(name, desc, traitsGranted, abilitiesGranted);
		this.strMod= strMod;
		this.staMod= staMod;
		this.agiMod= agiMod;
		this.speedMod= speedMod;
	}
	
	public int getStrMod(){
		return strMod;
	}
	
	public int getStaMod(){
		return staMod;
	}
	
	public int getAgiMod(){
		return agiMod;
	}
	
	public int getSpeedMod(){
		return speedMod;
	}
}
