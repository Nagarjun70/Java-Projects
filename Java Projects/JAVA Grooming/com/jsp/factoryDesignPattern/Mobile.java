package com.jsp.factoryDesignPattern;
//1.Mobile--> selectApp()--> 1.Uber 2:Ola 3: Rapido ---> Taxi
class Taxi
{
	
}
class Uber extends Taxi
{
	
}
class Ola extends Taxi
{
	
}
class Rapido extends Taxi
{
	
}
public class Mobile 
{
	public Taxi selectApp(int choice)
	{
		if(choice==1)
		{
			Uber u=new Uber();
			return u;
		}
		else if(choice==2)
		{
			Ola o=new Ola();
			return o;
		}
		else if(choice==3)
		{
			Rapido r=new Rapido();
			return r;
		}
		else
		{
			return null;
		}
	}
	public static void main(String[] args) 
	{
		Mobile mobile=new Mobile();
		Taxi t=mobile.selectApp(3);
		if(t instanceof Uber)
			{
				System.out.println("UBER APP SELECTED");
			}
			else if(t instanceof Ola)
			{
				System.out.println("OLA APP SELECTED");
			}
			else if( t instanceof Rapido)
			{
				System.out.println("RAPIDO APP SELECTED");
			}
			else {
				System.out.println("invalid choice !!");
			}
	
	}
}


