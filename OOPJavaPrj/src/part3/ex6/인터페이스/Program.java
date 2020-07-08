package part3.ex6.인터페이스;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		FileInputStream fis = new FileInputStream("src/part3/ex6/인터페이스/setting.txt");
		Scanner scan = new Scanner(fis);
		
		String className = scan.nextLine();
		//System.out.println(className);
		
		scan.close();
		fis.close();
		
		Class clazz = Class.forName(className);
		
		A a = new A();
		//B b = new B(); // 나중에 실체인 B를 만들고 나서는 여기에 생성시켜줘야됨
		X x = (X) clazz.newInstance(); //??
		a.setX(x);
		
		a.print();

	}

}
