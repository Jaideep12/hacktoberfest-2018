import java.io.*;
public class calc
{
	public static double add(double num1,double num2)
	{
		return num1+num2;
	}
	public static double sub(double num1,double num2)
	{
		if(num1>num2)
		return num1-num2;
		else
			return num2-num1;
	}
	public static double mul(double num1,double num2)
	{
		return num1*num2;
	}
	public static double div(double num1,double num2)
	{
		if(num2!=0)
		return num1/num2;
		else
			return 0;
	}
	public static void main(String args[])throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter the two numbers");
		double num1,num2,res;
		num1=Integer.parseInt(br.readLine());
		num2=Integer.parseInt(br.readLine());
		int ch;
		System.out.println("Enter the choice of operation to be performed");
		ch=Integer.parseInt(br.readLine());
		switch(ch)
		{
		   case 1:
			   res=add(num1,num2);
			   System.out.println("Result= "+res);
			   break;
		   case 2:
			   res=sub(num1,num2);
			   System.out.println("Result= "+res);
			   break;
		   case 3:
			   res=mul(num1,num2);
			   System.out.println("Result= "+res);
			   break;
		   case 4:
			   res=div(num1,num2);
			   System.out.println("Result= "+res);
			   break;	   
		
		}
	}
}