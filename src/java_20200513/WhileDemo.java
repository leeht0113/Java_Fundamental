package java_20200513;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i=1;
		while(i<=10) {
			sum += i;
			i++;
			
		}
		System.out.printf("1���� 10���� ���� %d �Դϴ�.%n",sum);
		
		//�������� while������ �ۼ��ϼ���.
		
		i=2;
		while(i<=9) {
			int j=1;
			while(j <= 9) {
		        System.out.printf("%d * %d = %d%n",i,j,i*j);
				j++;
			}
			i++;	
		}
			
	}
}
