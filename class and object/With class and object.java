/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Calculator{
    int a;                    //variable
    public int sub(int n1,int n2)           //int-method //sub-method name
    {
        int r=n1-n2;          //method
        return r;
        }                          
}
public class Main
{     //call sub method
	public static void main(String[] args) {
		int num1=6;
		int num2=5;
		Calculator calc=new Calculator();   //new Calculator creating new object
		int result= calc.sub(num1,num2);
		System.out.println(result);
	}
}
