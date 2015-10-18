
import java.util.Scanner;

public class MesPetit {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		int [] array = {15,7,3,9,5,6,7};
		
		for(int i=0; i < (array.length);i++){
			for(int j=0; j < (array.length);j++){
				if(array[i]<array[j]){
					int variable=array[i];
					array[i]=array[j];
					array[j]=variable;
				}
				
			}
			
		}
		System.out.print(array[0]);
	}
}
