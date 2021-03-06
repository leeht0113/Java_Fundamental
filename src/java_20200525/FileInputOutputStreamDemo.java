package java_20200525;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileInputOutputStreamDemo {

	public FileInputOutputStreamDemo() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
	
		try {
			fis = new FileInputStream(
				"c:\\dev\\jdk-11.0.7_windows-x64_bin.exe");//읽을 대상
			fos = new FileOutputStream("c:\\dev\\jdk.exe");//출력 대상
			
			int readByte = 0;
			//fis.read() : 한바이트 읽어 반환한다. 더이상 읽을 바이트가 없으면
			//-1을 반환한다.
			while((readByte = fis.read()) != -1) {
				//fos.write(~) : 한 바이트 쓰기
				fos.write(readByte);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fis.close();
			} catch (IOException e) {
		
			}

		}
	}
}	