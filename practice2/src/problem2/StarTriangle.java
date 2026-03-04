package problem2;

public class StarTriangle {
	private int width;

	public StarTriangle() {
		
	}
	
	public StarTriangle(int width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		String res = "";
		for( int i = 1; i <= width; i++) {
			for (int j = 1; j <= i ; j++) {
				res += "[*]";
			} 
			res += "\n";
		}
		
		return res;
		
	}
	
	

}









