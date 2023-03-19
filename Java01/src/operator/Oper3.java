package operator;

public class Oper3 {
	public static void main(String[] args) {
		boolean 참거짓 = true;       // 1
		참거짓 = false;              // 0
		
		참거짓 = 3 > 2;          // true
		System.out.println(참거짓);
		
		참거짓 = 3 < 2;          // false
		System.out.println(참거짓);
		
		참거짓 = 3 >= 2;          // true
		System.out.println(참거짓);
		
		참거짓 = 3 <= 2;          // false
		System.out.println(참거짓);
		
		System.out.println(3>2);  // true
		
		System.out.println("======================");
		
		// = : 대입연산자 (오른쪽에 있는 값을 왼쪽에 넣는다)
		// == : 같다 (수학의 =과 같은 의미)
		// != : 다르다 (수학의 ≠과 같은 의미)
		
		참거짓 = 2 == 2;           // true
		System.out.println(참거짓);
		
		참거짓 = 2 != 2;          // false
		System.out.println(참거짓);
	}
}
