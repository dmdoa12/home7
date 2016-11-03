package home7;

import java.util.*;

public class ExamVariousArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String check="";
		try{
			while(!check.equals("end")){
				mainMenu();
				System.out.print("원하는 메뉴는 >>");
				int menu = s.nextInt();
				switch(menu){
				case 1:
					new SecondMax().FindMax();
					break;
				case 2:
					new AvgScore().checkScore();
					break;
				case 3:
					new StudentScore().CalcGrade();
					break;
				case 4:
					new AptPersonCount().AptCount();
					break;
				case 5:
					new OnlyNumber().OnlyNum();
					break;
				case 6:
					check="end";
					break;
				default:
					System.out.print("잘못 입력하셨습니다.\n");
					continue;
				}//switch
			}//while
		}
		finally{
			if(s!=null)
				s.close();
			System.out.println("프로그램 종료");
		}
	}
	
	static void mainMenu(){
		System.out.println("1.두번째로 큰 수 찾기");
		System.out.println("2.심사 점수 계산");
		System.out.println("3.학생 총점,평균값 구하기");
		System.out.println("4.5층 아파트의 거주자 숫자 구하기");
		System.out.println("5.겹치지 않는 숫자 10개 입력받기");
		System.out.println("6.종료하기");
	}
}