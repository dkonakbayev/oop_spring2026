package problem1PartC;

import java.util.HashSet;

public class TestDevice {
	public static void main(String[] args) {
		Smartphone s1 = new Smartphone("Iphone" , 500000.00 , 512);
		Smartphone s2 = new Smartphone("Iphone" , 500000.00 , 256);
		Smartphone s3 = new Smartphone("Iphone" , 500000.00 , 512);
		
		HashSet<Smartphone> phones = new HashSet<>();
		
		phones.add(s1);
		phones.add(s2);
		phones.add(s3);
		
		for (Smartphone s : phones) {
			System.out.println(s);
		}
	}
}
