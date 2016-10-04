package zadanie;

public class Rectangle implements Shape {
	private double a;
    private double b;
 
    public double getA() {
        return a;
    }
 
    public void setA(double a) {
        this.a = a;
    }
 
    public double getB() {
        return b;
    }
 
    public void setB(double b) {
        this.b = b;
    }
 
    public Rectangle(double a, double b) {
        setA(a);
        setB(b);
    }
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*a + 2*b;
	}
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prostokąt, ");
        sb.append("bok A: " + a + ", ");
        sb.append("bok B: " + b + ", ");
        sb.append("pole: " + calculateArea() + ", ");
        sb.append("obwód: " + calculatePerimeter());
        return sb.toString();
	}

}
