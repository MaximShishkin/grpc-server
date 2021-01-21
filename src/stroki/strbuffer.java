package stroki;

public class strbuffer {
	public strbuffer()
	{
	     go();
	}

	void go()
	{
		StringBuffer s=new StringBuffer("ПЕРЕКАТИПОЛЕ");
		
		System.out.println("ДЛИНА СТРОКИ = " +s.length());
		
		System.out.println("ОБЁМ ВЫДЕЛЕННОЙ ПАМЯТИ = " +s.capacity());
		
		StringBuffer s1=new StringBuffer("ПЕРЕКАТИПОЛЕ"); //Строковый литерал
		
		System.out.println("КОНКАТЕНАЦИЯ s И s1 = " +s+" "+s1);
		
		System.out.println("ПЕРВЫЙ СИМВОЛ ИЗ s = " +s.charAt(0));
		
		char buf[] = new char[4];
		s.getChars(4,8,buf,0);
		
		System.out.println("ГРУППУ СИМВОЛОВ ИЗ s = ");
		System.out.println(buf);
		
		System.out.println("СРАВНЕНИЕ СТРОК "+s.equals(s1));
		
		// вставка символово в строку
		StringBuffer sb = new StringBuffer("I Java!");
		sb.insert(2, "like ");
		System.out.println(sb);
		
		//Удаление символов
		sb.delete(4, 7);
		System.out.println("После delete: " + sb) ;
		sb.deleteCharAt(0);
		System.out.println("После deleteCharAt: " + sb) ;
		
		System.out.println("ГРУППУ СИМВОЛОВ ИЗ s = "+s.substring(4,8));
		
		//изменение последовательности символов в буфере
		System.out.println(s);
		s .reverse();
		System.out.println(s);
		}
}

