package htu.edu.lesson3;

public class StringDataType {
	public static void main(String[] args) {
		////////////////////////////////////
		String str="Hello";
		System.out.println(str);
		
		String str2="Ata";
		String msg=str+" "+str2;//+ between tow strings will result in a new string concatination
//		
		System.out.println(msg);
		//same as above
		System.out.println(str+" "+str2);
		
		String msg2=msg+20;//a string + any other data type will result in a string concat
		System.out.println(msg2);
		
		int n1=10;
		int n2=20;
		
		System.out.println(n1+n2);
		
		String s1="10";
		String s2="20";
		System.out.println(s1+s2);
		
		////////////////////////////////////////////////////
		String s3="Hello";
		int s4=10;
		int s5=20;
		
		System.out.println(s3+s4+s5); // 1: s3+s4 ==> string: Hello10 , 2: Hello10+20 (string + int )==>Hello1020
		System.out.println(s3+(s4+s5));//sum s4+ s5 first, then conc with s3
	}
}
