package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Statistics{
	double area;
	double perimeter;
	Statistics statistics;
	
	public Statistics(double i, double j) {
		this.perimeter = i;
		this.area = j;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public void add(Statistics ds) {
		this.area = this.area + ds.area;
		this.perimeter = this.perimeter + ds.perimeter;
	}
	
}
