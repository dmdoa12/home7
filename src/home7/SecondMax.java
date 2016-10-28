package home7;

import java.util.*;

public class SecondMax {
	public void FindMax(){
		Scanner s = new Scanner(System.in);
		
		int[] array = new int[10];
		int firstMax_position=0;
		int secondMax_position=0;
		int firstMax=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for(int i=0; i<10; i++){
			System.out.printf("%d번째 수를 입력하시오:",i+1);
			array[i]=s.nextInt();
			if(array[i]>firstMax){
				firstMax=array[i];
				if(i!=0 && array[firstMax_position]>secondMax && secondMax<firstMax && array[i]>array[secondMax_position]){
					secondMax=array[firstMax_position];
					secondMax_position=i;
				}
				firstMax_position=i;
			}
			else if(array[i]>secondMax && secondMax<firstMax && array[i]>array[secondMax_position]){
				secondMax=array[i];
				secondMax_position=i;
			}
			System.out.printf("두번째로 큰 수는 %d번째 수 %d입니다.\n",(secondMax_position+1),secondMax);
		}
		
		
	}
}
