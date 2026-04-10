package problem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorldFrequency {

	public static void main(String[] args) {
		Map<String , Integer> wordCount = new HashMap<>();
		
		try( 
			BufferedReader reader = new BufferedReader(new FileReader("input.txt")); 
			PrintWriter writer = new PrintWriter(new FileWriter("report.txt"));
		){
			String line;
			
			while((line = reader.readLine()) != null) {
				
				line = line.toLowerCase();
				
				line = line.replaceAll("[^a-zа-я0-9 ]", "");
				
				String[] words = line.split("\\s+");
				
				for (String word : words) {
					if(!word.isEmpty()) {
						wordCount.put(word , wordCount.getOrDefault(word , 0)+1);
					}
				}
			}
			
			List<Map.Entry<String , Integer>> list = new ArrayList<>(wordCount.entrySet());
			
			list.sort((a , b) -> b.getValue() - a.getValue());
			
			for (Map.Entry<String , Integer> entry : list) {
				writer.println(entry.getKey() + ":" + entry.getValue());
			}
			
			System.out.println("Check report.txt");
			
		}
		catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
		
	}

}
