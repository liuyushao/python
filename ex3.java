import java.util.Scanner;

public class EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  in =new Scanner(System.in);
		
		System .out . print("�Ĥ@��÷�l����  :  ");			
		int  a = in .nextInt();
		
		System .out . print("�ĤG��÷�l����  :  ");			
		int b = in .nextInt();
		
		System .out . print("�ĤT��÷�l����  :  ");			
		int  c = in .nextInt();
		
		int  d =(a+b+c)/5;
		int  e =(a+b+c)%5;
		
		System.out.println(d+"�q �Ѿl"+e);
				
		in.close();
	}

}
