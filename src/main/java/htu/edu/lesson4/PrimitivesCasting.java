package htu.edu.lesson4;

public class PrimitivesCasting {
	public static void main(String[] args) {
		//implicit casting
		byte b=10;// bytes
		int i=b;//4 bytes
		
		System.out.println(b);
		System.out.println(i);
		
		//explicit casting
		//safe case
		int i2=20;//4 bytes
		byte b2=(byte) i2;//1 bytes 
		
		System.out.println(i2);
		System.out.println(b2);
		
		//unsafe case
		int i3=200;//4 bytes
		byte b3=(byte) i3;//1 bytes
				
		System.out.println(i3);
		System.out.println(b3);//-56
		/* Why -56?
		 * 200 :    128:1 64:1 32:0 16:0 8:1  4:0 2:0 1:0
		 * 200:   00000000 00000000 00000000 11001000
		 * Expclicit casting: 
		 * b3= 11001000
		 * 1: sign bit - minus
		 * 1001000
		 * 2's compiliment 
		 * 0110111
		 * + 
		 * 1
		 * --------
		 * 111000
		 * 8+16+32 = 56
		 * with the sign bit = -56
		 */
	}
}
