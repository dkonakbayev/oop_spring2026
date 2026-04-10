package problem5;

public class Main {
	public static void main(String[] args) {
		
		Chocolate[] chocolates = {
				new Chocolate(50 , "Twix"),
				new Chocolate(70 , "Snickers"),
				new Chocolate(60 , "MilkyWay")
		};
		
		Sort.bubbleSort(chocolates);
		
		System.out.println("chocolates sorted by bubble sort : ");
		for (Chocolate c : chocolates) {
			System.out.println(c);
		}
		
		
		Time[] times = {
				new Time(10 , 30 , 0),
				new Time(9 , 45 , 0),
				new Time(10 , 15 , 0)
		};
		
		Sort.selectionSort(times);
		System.out.println("Sorted times");
		for (Time t : times) {
			System.out.println(t);
		}
	}
}
