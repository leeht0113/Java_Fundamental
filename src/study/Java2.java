package study;

public class Java2 {
	public static void main(String[] args) {
		String season = null;
		int month = 0;
		if(month == 12 || month == 1 || month ==2) {
			season = "겨울";
		}else if(month == 3 || month == 4 || month == 5) {
			season = "봄";
		}else if (month == 6 || month == 7 || month == 8) {
			season ="여름";
		}else if (month == 9 || month == 10 || month == 11) {
			season = "가을";
		}else {
			season = "없는계절";
		}
	
		System.out.print(month+" 월은 "+season +" 입니다.\n");
		//%d => 정수형, %f => 실수형, %s => String, %n => 개행
		System.out.printf("%d 월은 %s 입니다. %n", month, season );
		
		//month => char, byte, short, int, String
		switch(month) {
		case 12 : 
		case 1 : 
		case 2 : season="겨울"; break;
		case 3 : 
		case 4 : 
		case 5 : season="봄";break;
		case 6 : 
		case 7 : 
		case 8 : season="여름";break;
		case 9 : 
		case 10 : 
		case 11 : season="가을";break;
		default : season="없는계절";
		}
		
		System.out.printf("%d 월은 %s 입니다.%n", month, season);
		
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			sum = sum + i;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);
		/*
		 * i = 1 , sum = 1
		 * i = 2 , sum = 3
		 * i = 3 , sum = 6
		 * i = 4 , sum = 10
		 * i = 5 , sum = 15
		 * i = 6 , sum = 21
		 * i = 7 , sum = 28
		 * i = 8 , sum = 36
		 * i = 9 , sum = 45
		 * i = 10, sum = 55 
		 * i = 11
		 */
		
		
		
	}
}