package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Square extends Shape{
	double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double area(){
		return this.getSide()*this.getSide();
	}
	
	public double perimeter(){
		return this.getSide()*4;
	}
}
