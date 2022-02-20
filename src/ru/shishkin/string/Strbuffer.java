package ru.shishkin.string;

public class Strbuffer {

	public Strbuffer()
	{
	     go();
	}

	void go()
	{
		StringBuffer s=new StringBuffer("������������");
		
		System.out.println("����� ������ = " +s.length());
		
		System.out.println("���� ���������� ������ = " +s.capacity());
		
		StringBuffer s1=new StringBuffer("������������"); //��������� �������
		
		System.out.println("������������ s � s1 = " +s+" "+s1);
		
		System.out.println("������ ������ �� s = " +s.charAt(0));
		
		char buf[] = new char[4];
		s.getChars(4,8,buf,0);
		
		System.out.println("������ �������� �� s = ");
		System.out.println(buf);
		
		System.out.println("��������� ����� "+s.equals(s1));
		
		// ������� ��������� � ������
		StringBuffer sb = new StringBuffer("I Java!");
		sb.insert(2, "like ");
		System.out.println(sb);
		
		//�������� ��������
		sb.delete(4, 7);
		System.out.println("����� delete: " + sb) ;
		sb.deleteCharAt(0);
		System.out.println("����� deleteCharAt: " + sb) ;
		
		System.out.println("������ �������� �� s = "+s.substring(4,8));
		
		//��������� ������������������ �������� � ������
		System.out.println(s);
		s .reverse();
		System.out.println(s);
		}
}

