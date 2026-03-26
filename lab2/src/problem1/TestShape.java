package problem1;

public class TestShape {

	public static void main(String[] args) {
		Cylinder cl1 = new Cylinder(4 , 5);
		Sphere s1 = new Sphere(7);
		Cube cb1 = new Cube(9);
		
		
	System.out.println("Cylinder`s volume : " + cl1.volume());
	System.out.println("Cylinder`s surface area : " + cl1.surfaceArea() + "\n");
	
	
	System.out.println("Sphere`s volume : " + s1.volume());
	System.out.println("Sphere`s surface area : " + s1.surfaceArea() + "\n");
	
	
	System.out.println("Cube`s volume : " + cb1.volume());
	System.out.println("Cube`s surface are : " + cb1.surfaceArea());
	}

}
