package app;

import java.util.Date;

public class SelectionLajittelu implements LajitteluAlgoritmi{

	@Override
	public void lajittele(int[] arr) {
		System.out.println("Valintalajittelu");
		long aikaAlussa = System.nanoTime();
		for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
		
		long aikaLopussa = System.nanoTime();
		System.out.println("Kulunut aika: " + (aikaLopussa-aikaAlussa) + " nanosekuntia");
		for(int i:arr){
			
            System.out.print(i);
            System.out.print(", ");
        }
	}

}
