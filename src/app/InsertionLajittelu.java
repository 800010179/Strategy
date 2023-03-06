package app;

import java.util.Date;

public class InsertionLajittelu implements LajitteluAlgoritmi{

	@Override
	public void lajittele(int[] arr) {
		System.out.println("Lisäyslajittelu");
		long aikaAlussa = System.nanoTime();
		int temp;
        for (int i = 1; i < arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
		long aikaLopussa = System.nanoTime();
		System.out.println("Kulunut aika: " + (aikaLopussa-aikaAlussa) + " nanosekuntia");
        for(int i:arr){
            System.out.print(i);
            System.out.print(", ");
        }
		
	}

}
