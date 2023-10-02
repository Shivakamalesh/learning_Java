/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class method
{
    public void playMusic()
    {
        System.out.println("Music Playing");
    }
     public String getMeAPen(int price)
    {
        return"pen";
    }
     public String getMeAScale(int cost)
    {
        if(cost>=10)
            return"scale";
        else
            return"Nothing";
    }
}




public class Main
{
	public static void main(String[] args) {
		method met=new method();
		met.playMusic();
		String str=met.getMeAPen(10);
		System.out.println(str);
		String tr=met.getMeAScale(5);
		System.out.println(tr);
		
		
	}
}
