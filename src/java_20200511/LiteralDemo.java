package java_20200511;

public class LiteralDemo {
	public static void main(String[] args) {
		//byte ���� (-128 ~127)�� �Ѿ�� overflow �߻� => compile error
		byte b1 = 128;
		
		int a1 = 128;//10���� ǥ���
		int a2 = 076;//8���� ǥ���
		int a3 = 0x123;//16���� ǥ���
		int a4 = 0b1010;//2���� ǥ���
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		//long ���ͷ��� ���ڵڿ� 1 �Ǵ� L�� ǥ��
		long l1 = 12;
		
		//float ���ͷ��� ���ڵڿ� f �Ǵ� F�� ǥ��
		float f1 = 123.4f;
		
		//double ���ͷ��� ���ڵڿ� d �Ǵ� D�� ǥ��, ��������
		double d1 = 123.36;
		
		//boolean ���ͷ��� true �Ǵ� false;
		boolean isExisted = false;
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2);
		
		System.out.println(b3);
		
		
	}
}
