package agostino.romanelli.harbour;

public class Sottomarino extends Invasore{
	int armamenti;
	int stazza;
	
	public int getArmamenti() {
		return armamenti;
	}
	public void setArmamenti(int armamenti) {
		this.armamenti = armamenti;
	}
	public int getStazza() {
		return stazza;
	}
	public void setStazza(int stazza) {
		this.stazza = stazza;
	}
	
	public int getP(){
		this.P = armamenti*stazza;
		return this.P;
	}
}
