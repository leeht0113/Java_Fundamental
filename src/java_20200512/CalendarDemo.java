package java_20200512;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * �޷� ����� 
		 * 1. 1�� 1�� 1�� ������
		 * 2. 1���� 365���̰�, �����϶��� 366�� (2�� 29��)
		 * 3. ������ 4�⸶�� �߻��ϰ�, ���߿� 100�� ����� �����ϰ�,
		 * 	  400����� �������� �ʴ´�.
		 * 4. 2020�� 5�� 12�� �������� �ϱ�?
		 * 5. 2019����� ���ϼ� + 4������ ���ϼ� + 12 ���ؼ� 7�� ���� �������� 
		 *    1�̸� ������, 2�̸� ȭ����, .....
		 * 1�� 364.24
		 * 
		 * (2019*365 +((2019/4 - 2019/100 + 2019/400)) + 31 +29+31+30)%7
		 * 
		 * */
		
		int year = 2020;
		int month = 5;
		int day = 12; 
		int totalCount = 0;
		int rest = 0;
		
		int preYear = year -1;
		//2019�� ���� ��
		totalCount = preYear * 365 +
				(preYear/4 - preYear/100 + preYear/400);
		//2019�� 1�� ~ 4������ ���� �� 
		totalCount += 31 + 29 + 31+ 30;
		
		//2019�� 5�� 12���� 12�� ���� ���� ��  
		totalCount += day;
		
		rest = totalCount % 7;
		String message = null;
		if(rest == 1) {
			message = "������";
		}else if(rest == 2) {
			message = "ȭ����";
		}else if(rest == 3) {
			message = "������";
		}else if(rest == 4) {
			message = "�����";
		}else if(rest == 5) {
			message = "�ݿ���";
		}else if(rest == 6) {
			message = "�����";
		}else if(rest == 7) {
			message = "�Ͽ���";
		}
		
		
		
		System.out.println(year+"��"+month+"��"+day+" ���� " + message+"�Դϴ�.");
		
		
	
	
	
	}
	
}	
	