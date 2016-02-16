package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Circle extends Shape{
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area(){
		double a = 0;
		double ric = this.radius*this.radius;
		ric = ric *3.1415926535897932;
		return ric;
	}
	
	public double perimeter(){
		return (this.radius*2)*3.14159265358;
	}
}
