package problem1;

public class DataTest {
	 
	private double sum;
	private double max;
	private int count;
	
	
	public DataTest() {
		this.sum = 0;
		this.max = 0;
		this.count = 0;
	}
	
	public void add(double value) {
		sum += value;
		
		if (count == 0 || value > max) {
			max = value;
		}
		count++;
	}
	
	public double getavg() {
		if (count == 0) {
			return 0;
		}
		return sum/count;
	}
	
	public double getmax() {
		return max;
	}
}








