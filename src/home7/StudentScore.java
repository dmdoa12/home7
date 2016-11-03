package home7;

import java.util.*;

public class StudentScore {
	public void CalcGrade(){
		Scanner s = new Scanner(System.in);
		
		int student[][] = new int[5][4];
		double avg[] = new double[5];
		int lan_tot=0,eng_tot=0,math_tot=0;
		double lan_avg=0,eng_avg=0,math_avg=0;
		
		for(int i=0; i<5; i++){
			System.out.printf("%d번 학생 국어,영어,수학:",i+1);
			for(int j=0; j<3; j++){
				student[i][j]=s.nextInt();
				student[i][3]=student[i][3]+student[i][j];
				
				if(j==0){
					lan_tot=lan_tot+student[i][j];
				}
				else if(j==1){
					eng_tot=eng_tot+student[i][j];
				}
				else{
					math_tot=math_tot+student[i][j];
				}
			}
			avg[i]=student[i][3]/(double)3;
		}
		
		lan_avg=lan_tot/(double)5;
		eng_avg=eng_tot/(double)5;
		math_avg=math_tot/(double)5;
		
		System.out.printf("국어총점은 %d점이고,평균은  %.1f 입니다.\n",lan_tot,lan_avg);
		System.out.printf("영어총점은 %d점이고,평균은  %.1f 입니다.\n",eng_tot,eng_avg);
		System.out.printf("수학총점은 %d점이고,평균은  %.1f 입니다.\n",math_tot,math_avg);
		
		for(int i=0; i<5; i++)
			System.out.printf("%d번 학생의 총점은 %d,평균은 %.1f 이다.\n",i+1,student[i][3],avg[i]);
	}
}
