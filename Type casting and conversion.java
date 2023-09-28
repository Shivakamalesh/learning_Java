/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Type Conversion");
		byte b=127;
		int a=b;              //here the byte value is assingned to Integer
		System.out.println(a); 
		
		/*int c=15;
		byte k=c;                         //output will be error
		System.out.println(k);*/
		
		int c=15;
		byte k=(byte)c;       //in this we are using (byte)that is  TYPE CASTING
		System.out.println(k);
		
		int d=257;
		byte r=(byte)d;         //output is 1 beacuse int value is till 256 so for 257 it will do modulus
		System.out.println(r);
	}
}
