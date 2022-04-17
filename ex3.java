import java.util.Scanner;

public class EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  in =new Scanner(System.in);
		
		System .out . print("第一條繩子長度  :  ");			
		int  a = in .nextInt();
		
		System .out . print("第二條繩子長度  :  ");			
		int b = in .nextInt();
		
		System .out . print("第三條繩子長度  :  ");			
		int  c = in .nextInt();
		
		int  d =(a+b+c)/5;
		int  e =(a+b+c)%5;
		
		System.out.println(d+"段 剩餘"+e);
				
		in.close();
	}

}
