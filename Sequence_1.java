/* 
    Georgios Loudaros
	Sequence: a1 = -1, a2 = 1, an+2 = 3*an - 4*an+1 
*/
public class Sequence_1{

	public static void main(String []args){

		int a1 = -1;
		int a2 = 1;
		int an;
		
		System.out.println("Sequence");
		
		for (int i=1; i<=10; i++){

			an = 3*a1 - 4*a2;
			System.out.println("a" + i + "=" + an);
			a1 = a2;
			a2 = an;
		}
		
	}
}
