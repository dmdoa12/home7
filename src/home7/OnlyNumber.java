package home7;

import java.util.*;

public class OnlyNumber {
	public void OnlyNum(){
		Scanner s = new Scanner(System.in);

		int num[] = new int[10];
		int point=0;
		int cnt=0;

		System.out.println("1~100사이의 숫자를 입력하세요");
		while(cnt<10){
			System.out.printf("%d번째 숫자 : ",cnt+1);
			
			num[cnt] = s.nextInt();
			
			if((ArrayCheck(num,cnt-1,num[cnt]) || num[cnt]>100 || num[cnt]<1) && cnt!=0){
				System.out.println("잘못 입력하였습니다. 다시 입력하세요");
				continue;
			}
			else
				cnt++;

		}
		
		for(int i=10; i>0; i--)
			System.out.printf("%d번째 숫자는 %d입니다.\n",i,num[i-1]);
	}
	
	public boolean ArrayCheck(int[] num,int index,int input){
		boolean flag=false;
		
		for(int i=0; i<index+1; i++)
			if(num[i] == input)
				flag=true;
		
		return flag;
	}
}
