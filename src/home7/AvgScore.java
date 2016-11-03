package home7;

import java.util.*;

public class AvgScore {
	public void checkScore(){
		Scanner s = new Scanner(System.in);
		
		double[] score = new double[10];
		double max_score=0,min_score=Integer.MAX_VALUE,tot_score=0,avg_score=0;
		
		for(int i=0; i<10; i++){
			System.out.printf("%d번째 심사점수 입력:",i+1);
			score[i] = s.nextDouble();
			
			max_score = Math.max(score[i],max_score);
			min_score = Math.min(score[i],min_score);
			
			tot_score=tot_score+score[i];
		}
		avg_score = (tot_score-max_score-min_score)/8;
		
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 \n8개의 점수 평균은  %.1f입니다.\n",avg_score);
	}
}
