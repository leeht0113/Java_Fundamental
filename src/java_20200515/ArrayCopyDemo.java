package java_20200515;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] fruits = {"apple","banana","watermelon","blueberry"};
		
		String[] temp = new String[6];
		//fruits => �����迭
		// 0 => �����迭�� ��ġ
		// temp => ������ �迭
		// 2 => ������ �迭�� ��ġ
		// 4 => �����迭�� 4�� ��Ҹ� ����
		System.arraycopy(fruits, 0, temp, 2, 4);
			
		temp[0] = "peach";
		temp[1] = "pear";
		
		System.out.println(temp[0].length());
		
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		
		for(String value : temp) {
			System.out.println(value);
		}
		
		
		}
	}

