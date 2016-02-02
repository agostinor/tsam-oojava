package agostino.romanelli.harbour;

public class Aereo extends Invasore{
	private ArmamentiAlpha[] armamentiAlpha;
	private ArmamentiBeta[] armamentiBeta;
	
	public int getP(){
		this.P = (getArmamentiAlpha().length*10)+(getArmamentiBeta().length*15);
		return this.P;
	}

	public ArmamentiAlpha[] getArmamentiAlpha() {
		return armamentiAlpha;
	}

	public void setArmamentiAlpha(ArmamentiAlpha[] armamentiAlpha) {
		this.armamentiAlpha = armamentiAlpha;
	}

	public ArmamentiBeta[] getArmamentiBeta() {
		return armamentiBeta;
	}

	public void setArmamentiBeta(ArmamentiBeta[] armamentiBeta) {
		this.armamentiBeta = armamentiBeta;
	}

/*	public int getP(){
		this.P = armamentiAlpha.length+(armamentiBeta.length;
		return this.P;
	}
*/
}
