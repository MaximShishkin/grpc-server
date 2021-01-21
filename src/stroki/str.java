package stroki;

public class str {
	public str()
	{
	     go();
	}

	void go()
	{
		String s=new String("ПЕРЕКАТИПОЛЕ");
		
		System.out.println("ДЛИНА СТРОКИ = " +s.length());
		
		String s1="ПЕРЕКАТИПОЛЕ"; //Строковый литерал
		
		System.out.println("КОНКАТЕНАЦИЯ s И s1 = " +s+" "+s1);
		
		System.out.println("ПЕРВЫЙ СИМВОЛ ИЗ s = " +s.charAt(0));
		
		char buf[] = new char[4];
		s.getChars(4,8,buf,0);
		
		System.out.println("ГРУППУ СИМВОЛОВ ИЗ s = ");
		System.out.println(buf);
		
		System.out.println("СРАВНЕНИЕ СТРОК "+s.equals(s1));
		
		System.out.println("СРАВНЕНИЕ СТРОК "+s.compareTo(s1));//0 - если равны! s<s1=-1 s>s1=1
		
		System.out.println("ГРУППУ СИМВОЛОВ ИЗ s = "+s.substring(4,8));
		
		String s2=s.replace("П","К");
		System.out.println("ЗАМЕНА СИМВОЛОВ В s = "+s2);
		
		System.out.println("ВОЗВРАЩЕНИЕ ТИПА СТРИНГ s = "+String.valueOf(s2));
		
		String upper = s.toUpperCase();
		String lower = s.toLowerCase();
		System.out.println("Верхний регистр: " + upper);
		System.out.println("Нижний регистр: " + lower);
		
		System.out.println("Если строка пустая то возвращает true = "+lower.isEmpty());
		
		String mas[]=s.trim().split("",-1);
		
		System.out.println(mas);
	}
}
