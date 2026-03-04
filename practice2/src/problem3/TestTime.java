package problem3;

public class TestTime {

	public static void main(String[] args) {
		Time t = new Time(23, 5,6);
		System.out.println(t.toUniversal());// prints "23:05:06"
		System.out.println(t.toStandard());//prints "11:05:06 PM"
		Time t2 = new Time(2,58,57);
		t.add(t2);
		
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
	}

}
