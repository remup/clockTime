package clockProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Clock {

	public static void main(String[] args) {
		
		int[] arrayClock = { 1, 0, 3, 2 };
		TreeSet<Integer> t1 = new TreeSet<>();
		TreeSet<Integer> t2 = new TreeSet<>();
		
		List<Integer> t3 = new ArrayList<>();
		int temp1=0;
		int temp2=0;
		
		for (int i = 0; i < arrayClock.length - 1; i++) {
			for (int j = i + 1; j < arrayClock.length; j++) {
				int hours1 = Integer.parseInt(Integer.toString(arrayClock[i]) + Integer.toString(arrayClock[j]));
				int hours2 = Integer.parseInt(Integer.toString(arrayClock[j]) + Integer.toString(arrayClock[i]));
				if (hours1 <= 24) {
					t1.add(hours1);
				}
				if (hours2 <= 24) {
					t1.add(hours2);
				}

			}

		}
		System.out.println("final time format hours" + t1.toArray()[t1.toArray().length - 1]);
		
		temp1= Integer.toString((int) t1.toArray()[t1.toArray().length - 1]).charAt(0);
		temp2= Integer.toString((int) t1.toArray()[t1.toArray().length - 1]).charAt(1);
		
		
		for (int i = 0; i < arrayClock.length - 1; i++) {
			if(arrayClock[i]!=temp1 && arrayClock[i]!=temp1) {
				t3.add(arrayClock[i]);
				
			
			}
			
		}

		for (int i = 0; i < t3.size()-1; i++) {
			for (int j = i + 1; j < t3.size()-1; j++) {
				
				int time1 = Integer.parseInt(Integer.toString(t3.get(i))+Integer.toString(t3.get(j)));
				int time2 = Integer.parseInt(Integer.toString(t3.get(j))+Integer.toString(t3.get(i)));
				
				if (time1 <= 59) {
					t2.add(time1);
				}
				if (time2 <= 59) {
					t2.add(time2);
				}

			}
			

		}
		
		System.out.println("final time format min" + t2.toArray()[t2.toArray().length - 1]);
		
		
		
		
		
		// other solution

		String maxHour = "23";
		String maxMinut = "59";
		String temp = "";
		String tempMaxHour = "00";
		String tempMaxMint = "00";
		//int[] timeArray = { 0, 9, 5, 0 };
		
		int[] timeArray = { 1, 0, 3, 2 };

		int hourIndex = 0;
		int hourIndex1 = 0;

		for (int i = 0; i <= timeArray.length - 1; i++) {
			for (int j = 0; j <= timeArray.length - 1; j++) {
				if (i != j) {
					temp = "" + timeArray[i] + timeArray[j];
					if (Integer.parseInt(temp) <= Integer.parseInt(maxHour)
							&& Integer.parseInt(temp) > Integer.parseInt(tempMaxHour)) {
						tempMaxHour = temp;
						hourIndex = i;
						hourIndex1 = j;
					}
				}
			}
		}
		String tempMin = "";
		for (int i = 0; i <= timeArray.length - 1; i++) {
			if (i != hourIndex && i != hourIndex1) {
				tempMin = tempMin + timeArray[i];
			}
		}

		String tempMin1 = new StringBuilder(tempMin).reverse().toString();

		if (Integer.parseInt(tempMin1) <= Integer.parseInt(maxMinut)) {
			tempMaxMint = tempMin1;
			System.out.println(tempMaxHour);
			System.out.println(tempMaxMint);
		}

	}

}
