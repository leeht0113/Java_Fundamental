package java_20200512;

public class SwitchDemo {
	public static void main (String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = null;
		//month =>����(char, byte, short , int , String)
		switch(month) {
		//case �򰡰� => �ݵ�� �����ؾ� ��,
		//case ���� break�� ������ �Ʒ��� case�� �̵��Ѵ�.
		case 12 : 
		case 1 : 
		case 2 : season="�ܿ�";break;
		case 3 :  
		case 5 : season="��";break;
		case 6 : 		
		case 8 : season="����";break;
		case 9 : 
		case 10 : 
		case 11 : season="����";break;
		//default�� ��ġ�� ��� �ֵ� �������.
		//������ ���忡 ������ break���� ������� ������ �ٸ����� ���� ��쿡��
		//break���� ����ؾ� �Ѵ�.(�ʼ��� �ƴ����� ���� ���� ����� �߻��� �� ����)
		default : season="���� ����";
		}
	
		System.out.println(month+"���� "+season+" �Դϴ�.");
	}
	
}
