/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Updating the array values");
		int num[]={3,5,7,8};
		num[1]=6;//Updating value for 1st index position
		System.out.println(num[1]);
        System.out.println("Dynamic array");		
        
        int arr[]=new int[4];//intially the values will be zero
        System.out.println(arr[1]);
        //assinging the values to the array
        arr[0]=5;
        arr[1]=6;
        arr[2]=9;
        arr[3]=8;
         System.out.println(arr[1]);
         System.out.println("printing all the values");
         
         for(int i=0;i<4;i++) {
             System.out.println(arr[i]);
         }  
        }
}
