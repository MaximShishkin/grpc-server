package ru.shishkin.string;

public class Str {

	public Str()
	{
		go();
	}

	void go()
	{
		String s=new String("������������");
		
		System.out.println("����� ������ = " +s.length());
		
		String s1="������������"; //��������� �������
		
		System.out.println("������������ s � s1 = " +s+" "+s1);
		
		System.out.println("������ ������ �� s = " +s.charAt(0));
		
		char buf[] = new char[4];
		s.getChars(4,8,buf,0);
		
		System.out.println("������ �������� �� s = ");
		System.out.println(buf);
		
		System.out.println("��������� ����� "+s.equals(s1));
		
		System.out.println("��������� ����� "+s.compareTo(s1));//0 - ���� �����! s<s1=-1 s>s1=1
		
		System.out.println("������ �������� �� s = "+s.substring(4,8));
		
		String s2=s.replace("�","�");
		System.out.println("������ �������� � s = "+s2);
		
		System.out.println("����������� ���� ������ s = "+String.valueOf(s2));
		
		String upper = s.toUpperCase();
		String lower = s.toLowerCase();
		System.out.println("������� �������: " + upper);
		System.out.println("������ �������: " + lower);
		
		System.out.println("���� ������ ������ �� ���������� true = "+lower.isEmpty());
		
		String mas[]=s.trim().split("",-1);
		
		System.out.println(mas);
	}
}
