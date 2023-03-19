package operator;

public class Oper2 {
	public static void main(String[] args) {
		int 국어 = 49;
		int 영어 = 40;
		int 수학 = 60;
		
		int sum = 국어+영어+수학;
		int average = sum/3;
		
		System.out.println("합계 : "+sum+"점");
		System.out.println("평균 : "+average+"점");
		
		System.out.println("평균 : "+(sum/3)+"점");
		System.out.println("평균 : "+((double)sum/3)+"점");     // 소수점을 표시할 때 
		System.out.println("평균 : "+(sum/3.0)+"점");             // 소수점을 표시할 때 
		
	}
}
