package matriz3x3;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
//		int[][] matriz = new int[3][3];
//		Random rand = new Random();
//		int valor=0;
//		for(int i =0; i<matriz.length; i++) {
//			for(int j =0; j<matriz.length; j++) {
//				matriz[i][j]=rand.nextInt(10)+valor;
//			}
//			valor+=10;
//		}
//		System.out.println(Arrays.deepToString(matriz));
//		
//		System.out.println(Arrays.toString(matriz[0]));
//		System.out.println(Arrays.toString(matriz[1]));
//		System.out.println(Arrays.toString(matriz[2]));
		int[][] matriz = new int[5][5];
		for(int i =0; i<matriz.length; i++) {
			for(int j =0; j<matriz.length; j++) {
				if(matriz[i]==matriz[j]) {
					matriz[i][j]=1;
				}
				else
					matriz[i][j]=0;
			}
		}
		System.out.println(Arrays.deepToString(matriz));
		for(int i=0; i<matriz.length;i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
	}
}
