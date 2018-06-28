/*
	Fibonacci sequence -> 1*2*3*4-5*...*n
*/
public class Sequence_Fibonacci{

	public static void main(String []args){

		long f = 1;
		
		System.out.println("Fibonacci sequence");
		System.out.println("a1=1");
		
		for (int i=2; i<=20; i++){
			
			f = f * i;
			System.out.println("a" + i + "=" + f);
			
			
        }
		
	}
}