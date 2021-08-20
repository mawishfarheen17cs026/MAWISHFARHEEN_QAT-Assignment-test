package AssignmentTest;

import java.util.ArrayList;
import java.util.Scanner;

public class REVERSINGWORDS {
	
	public static void main(String[] args) {
		ArrayList<String> arrL =new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of string array:" );
		int s = sc.nextInt();
		for(int i=0;i<s;i++) {
			arrL.add(sc.next());
		}
		
		System.out.print("Reversed String is" + " ");
		
		for(int j=arrL.size()-1;j>=0;j--) {
			System.out.print(arrL.get(j));
		}
		
	}

}
