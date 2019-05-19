package soal_2;

import java.util.Scanner;

/*Buatlah program perkalian matriks 2x2 dengan adanya masukan
 * dan menggunakan array.*/

public class PerkalianMatriks {
	private static Scanner myScanner;

	public static void main(String []args) {
		int m, n, p, q, total = 0, c, d, k;
		
		myScanner = new Scanner(System.in);
		System.out.println("Masukan jumlah kolom dan baris dari matriks pertama");
		m = myScanner.nextInt();
		n = myScanner.nextInt();
		
		int m_satu[][] = new int[m][n];
		
		System.out.println("Masukkan elemen dari matriks pertama");
		
		for(c = 0; c < m; c++) {
			for(d = 0; d < n; d++) {
				m_satu[c][d] = myScanner.nextInt();
			}
		}
		
		System.out.println("Masukkan jumlah kolom dan baris dari matriks kedua");
		p = myScanner.nextInt();
		q = myScanner.nextInt();
		
		if(n != p) {
			System.out.println("Matriks tidak bisa dikalikan karena perbedaan jumlah kolom dan baris");
		} else {
			int m_dua[][] = new int[p][q];
			int perkalian[][] = new int[m][q];
			
			System.out.println("Masukkan elemen kedua dari matriks");
			for(c = 0; c < m; c++) {
				for(d = 0; d < n; d++) {
					m_dua[c][d] = myScanner.nextInt();
				}
			}
			
			for(c = 0; c < m; c++) {
				for(d = 0; d < q; d++) {
					for(k = 0; k < p; k++) {
						total = total + m_satu[c][k] * m_dua[k][d];
					}
					perkalian[c][d] = total;
					total = 0;
				}
			}
			
			System.out.println("Hasil perkalian dari matriks");
			for(c = 0; c < m; c++) {
				for(d = 0; d < n; d++) {
					System.out.print(perkalian[c][d] + "\t");
				}
				System.out.print("\n");
			}
		}
	}
}
