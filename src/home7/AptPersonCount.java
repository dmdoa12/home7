package home7;

import java.util.*;

public class AptPersonCount {
	public void AptCount(){
		Scanner s = new Scanner(System.in);
		
		int apt[][] = new int[5][4];
		int person_cnt[] = new int[3];
		int tot_person=0;
		System.out.printf("5층 아파트의 거주자 인원 파악하기\n");
		for(int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				System.out.printf("%d0%d호에 살고 있는 사람의 숫자 : ",i+1,j+1);
				apt[i][j] = s.nextInt();
				apt[i][3] = apt[i][3]+apt[i][j];
				tot_person=tot_person+apt[i][j];
				
				if(j==0){
					person_cnt[j]=person_cnt[j]+apt[i][j];
				}
				else if(j==1){
					person_cnt[j]=person_cnt[j]+apt[i][j];
				}
				else{
					person_cnt[j]=person_cnt[j]+apt[i][j];
				}
			}
		}
		
		System.out.printf("이 아파트의 거주자는 모두 %d명입니다.\n", tot_person);
		for(int i=0; i<5; i++){
			System.out.printf("%d층에 사는 거주자는 모두 %d명입니다.\n",i+1,apt[i][3]);
		}
		for(int i=0; i<3; i++){
			System.out.printf("%d호 라인에 사는 거주자는 모두 %d명\n",i+1,person_cnt[i]);
		}
	}
}
