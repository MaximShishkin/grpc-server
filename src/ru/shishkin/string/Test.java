package ru.shishkin.string;

public class Test {

	public Test()
	{
		System.out.println(checkpalidrom(2574452));
	}
	
	String checkpalidrom(int chislo)
	{
		
		StringBuffer str=new StringBuffer("").append(chislo);
		
		str.reverse();
		
		String str1=str.substring(0,str.length());
		
		if(chislo==Integer.parseInt(str1))
		{
			return "������ ����� "+chislo+" �������� �����������";
		}
		else
		{
			return "������ ����� "+chislo+" �� �������� �����������";
		}
	}
}
