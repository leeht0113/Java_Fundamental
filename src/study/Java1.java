package study;

public class Java1 {

	public static void main(String[] args) {
		//식별자 - 클래스명, 변수명, 메서드명, 패키지이름

		int a1 = 10;
		int a_1 = 10;
		int $1 = 10;
		int fatherAge = 50;
		int fatherage = 50; //대소문자 구분되기 때문에 다른 단어로 인식
		//숫자로 시작하면 안됨
		//int 1a = 10;
		
		//특수문자는 사용불가(예외 $,_)
		//int a# = 20;
	
		//공백을 허용하지 않음
		//int father Age = 10;
	
		//예약어는 사용할 수 없음
		//int break = 10;
		
		//10진수 표현법
		byte b1 = 10;
		
		//8진수 표현법
		byte b2= 012;
		
		//2진수 표현법
		byte b3 = 0b1010;
		
		//16진수 표현법
		short b4 = 0x12a2;
		
		int a2 = 100; //byte가 int로 캐스팅
		long l1 = 100l; //l을 안 붙이고 long 범위보다 작으면 자동 캐스팅, 21억이 넘으면 강제로 끝에 l을 붙여야함
		
		float f1 = 12.45f;
		
		double d1 = 12.45d;//d는 생략가능

		boolean isSuccess = false;
		
		//문자 표현법
		char c1 = 'a';
		
		//아스키코드 표현법 코딩 테스트 때 중요할 수도 있음
		char c2 = 97;
		
		//유니코드 표현법
		char c3 = '\uc131';
		
		char c4 = '\'';
		
		char c5 = '\\';
		
		char c6 = '\"';
		
		System.out.println("aaa"+'\t'+"bbb");
	
		//casting 했을 경우 circuit 발생
		byte e1 = (byte)128;// -128 ~ 127
		
		System.out.println(e1);
		
		//casting 했을 경우 cut 발생
		int e2 = (int)1234.56;
		System.out.println(e2);
		
		int e3 = 10;
		System.out.println(e3);
		int e4 = e3++;//대입후 증가
		System.out.println(e4);
		System.out.println(e3);
		int e5 = ++e3;//증가후 대입
		System.out.println(e5);
		System.out.println(e3);
		
		int e8 = 10;
		double e6 = 10.00;
		System.out.println(e8==e6);
	
		// a && b => a => false일 때 short circuit 발생

		// a || b => a> true 일 때  short circuit 발생 
		
		System.out.println(1+2+3+"abcd"); //primitive면 계산, 문자면 연결
		
		System.out.println("abcd"+(1+2+3)); //abcd6이 나오게 하려면 괄호 붙임
		
	
	}
}
