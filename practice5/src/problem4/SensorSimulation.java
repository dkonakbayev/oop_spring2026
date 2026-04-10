package problem4;

import java.io.*;
public class SensorSimulation {

	public static void main(String[] args) {
		String filename = "sensor.bin";
		
		try (RandomAccessFile raf = new RandomAccessFile(filename , "rw")){
			raf.seek(29L * 8);
			raf.writeDouble(999.9);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream(filename))){
			double sum = 0 ;
			double max = Double.MIN_VALUE;
			
			for (int i = 0 ; i < 60 ; i++) {
				double temp = dis.readDouble();
				sum += temp;
				if (temp > max) {
					max = temp;
				}
			}
			
			double average = sum / 60;
			 System.out.println("Average temperature: " + average);
	         System.out.println("Max temperature: " + max);

		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
