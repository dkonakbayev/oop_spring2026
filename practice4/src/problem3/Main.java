package problem3;

public class Main {

	public static void main(String[] args) {
		
		LogicGame lg = new LogicGame();
		MemoryGame mg = new MemoryGame();
		
		App.getStatistics(lg);
		System.out.println("---");
		App.getStatistics(mg);
		
		System.out.println("\n");
		
		Iphone iphone = new Iphone();
		iphone.sell();
		iphone.plugIn();
	}

}
