

/**
 * This class is written to solve Day 1 of Google's Advent of Code challenge.
 * It takes the input file and determines which values sum to 2020.
 * @author Jonathan Terry
 *
 */

import java.io.*;
import java.util.*;

public class InputSummer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File input = new File("src/Day1Input");
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		
		try {
			Scanner fileData = new Scanner(input);
			while(fileData.hasNextLine()) {
				int value = Integer.parseInt(fileData.nextLine());
				numbers1.add(value);
				numbers2.add(value);
			}
			
			for(Integer i : numbers1) {
				System.out.println(i);
			}
			
			for(int i = 0; i < numbers1.size(); i++) {
				for(int j = 0; j < numbers2.size(); j++) {
					if(numbers1.get(i) + numbers2.get(j) == 2020) {
						System.out.println("ANSWER: " + numbers1.get(i) * numbers2.get(j));
					}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
