package zadanie;

public class Circle implements Shape {
	
	private double r;
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public Circle(double r ) {
		setR(r);
	}
	@Override
	public double calculateArea() {
		return Shape.PI * r*r;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2* Shape.PI * r;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Koło, ");
        sb.append("promień: " + r + ", ");
        sb.append("pole: " + calculateArea() + ", ");
        sb.append("obwód: " + calculatePerimeter());
        return sb.toString();
    }
	

}
