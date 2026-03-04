package problem3;

public class TestTemperature {
	public static void main(String[] args) {
		

		        Temperature temp1 = new Temperature(); 
		        Temperature temp2 = new Temperature(100, 'C');
		        Temperature temp3 = new Temperature(32, 'F');

		        System.out.println("temp1 in Celsius: " + temp1.getCelsius());
		        
		        System.out.println("temp1 in Fahrenheit: " + temp1.getFarenheit());

		        System.out.println("temp2 in Fahrenheit: " + temp2.getFarenheit());

		        System.out.println("temp3 in Celsius: " + temp3.getCelsius());

		        
		        
		        
		        temp1.setTemperature(212, 'F');
		        System.out.println("temp1 now in Celsius: " + temp1.getCelsius());
		    }
		

	}

