package java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {
		//1. �����ڵ� ǥ�� => '\u0000'
		char c1 = '\uC131';
		char c2 = '\uC601';
		char c3 = '\uD55C';
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		
		//2. �ƽ�Ű�ڵ� ǥ��
		// 48 - 57 => 0-9
		// 65 - 90 => A-Z
		// 97 - 122 => a-z
		char c4 = 97;
		System.out.println(c4);
		
		//3. ���� ǥ����
		char c5 = '��';
		System.out.println(c5);
		
		
		char c6 = '\\';
		char c7 = '\'';
		char c8 = '\"';
		String s1 = "\\";
		String s2 = "\"";
		String s3 = "\'";
		
		System.out.println("aa"+'\t'+"bb");
		System.out.println("aa"+'\n'+"bb");
		System.out.println("aa"+'\r'+"bb");
	}
	
	
	
}
