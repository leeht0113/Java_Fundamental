package java_20200514;

public class demo {
	public static void main(String[] args) {
		int year = 2020;
		int month = 10;
		int day = 25;
		int totalCount = 0;
		int rest = 0;
		
		int preYear = year - 1;
		totalCount = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		int [] monthArray = {31,28,30,31,30,31,31,30,31,30,31};
		
		boolean isLeafYear = year%4==0 && year%100 != 0 || year%400==0;
		
		if(isLeafYear) {
			monthArray[1] = 29;
			
		for(int i=0;i<month;i++) {
			totalCount += monthArray[i];
		}
		}
	}

}
