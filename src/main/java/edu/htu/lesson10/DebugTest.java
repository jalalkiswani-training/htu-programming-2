package edu.htu.lesson10;

public class DebugTest {
	public static void main(String[] args) {
		int i=10;
		i*=20;
		i=dosomthing(i);
		i=i+5;
		int s=(i+10)/5000+20000-3000;
		System.out.println(s);
	}

	private static int dosomthing(int i) {
		i=i+100;
		i=i*20;
		return i;
	}
}
