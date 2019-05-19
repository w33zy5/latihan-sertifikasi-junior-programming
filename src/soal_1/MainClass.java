package soal_1;

import java.util.Scanner;

/*Buatlah algoritma dengan flowchart dan program untuk menampilkan
 * bilangan genap, bilangan faktorial, dan bilangan prima. dengan
 * ketentuan sebagai berikut:
 * a. Terdapat menu pilihan untuk memilih apakah akan menampilkan bilangan genap,
 * bilangan faktorial, atau bilangan prima
 * b. Terdapat masukan yang digunakan untuk batas jumlah tampilan data
 * c. Masing -masing perhitungan dibuat dalam function atau prosedur
 * d. Validasi semua inputan
 * e. Gunakan error handling
 * f. Gunakan array untuk menampilkan bilangan prima*/

public class MainClass {
	
	private static Scanner myScanner;
	public static int jumlahData;
	
	public static void main(String[] args) {
		MainMenu();
	}
	
	static void MainMenu() {
		myScanner = new Scanner(System.in);
		System.out.print("Menu\n1.Hitung Bilangan Genap\n2.Hitung Bilangan Faktorial\n3.Hitung Bilangan Prima\nJawab: ");
		String stringPilihan = myScanner.nextLine();
		
		if(CheckInput(stringPilihan) == 1) {
			System.out.print("Masukkan bilangan genap: ");
			String stringNilai = myScanner.nextLine();
			System.out.print("Banyak bilangan yang ingin dikeluarkan: ");
			String stringJumlah = myScanner.nextLine();
			jumlahData = CheckInput(stringJumlah);
			CheckIfEven(stringNilai);
			
		} else if(CheckInput(stringPilihan) == 2){
			System.out.print("Masukkan bilangan faktorial: ");
			String stringNilai = myScanner.nextLine();
			CheckFactorial(stringNilai);
			
		} else if(CheckInput(stringPilihan) == 3) {
			System.out.print("Masukkan bilangan: ");
			String stringNilai = myScanner.nextLine();
			CheckPrime(stringNilai);
		}
		else {
			System.out.println("Input Nilai pilihan bukan angka");
		}
	}
	
	static int CheckInput(String jawaban) {
		try {
			int nilai = Integer.parseInt(jawaban);
			return nilai;
		} catch (Exception e) {
			System.out.println("Error, input bukan int, " + e);
		}
		return 0;
	}
	
	static void CheckIfEven(String jawaban) {
		try {
			int input = Integer.parseInt(jawaban);
			float hitung = input%2;
			if(hitung == 0) {
				System.out.println(input + " adalah bilangan genap");
				for(int i = 1; i <= jumlahData; i ++) {
					System.out.print(input * i + " ");
				}
			} else {
				System.out.print(jawaban + " bukan bilangan genap");
			}
		} catch (Exception e) {
			System.out.println("Nilai yang di input bukan integer, " + e);
		}
	}
	
	static void CheckFactorial(String jawaban) {
		float jumlahFaktorial = Float.parseFloat(jawaban);
		
		float nilaiFaktorial = 1;
		for(int i = 1; i <= jumlahFaktorial; i++) {
			nilaiFaktorial = nilaiFaktorial * i;
			//System.out.print(nilaiFaktorial + " ");
		}
		System.out.println("Faktorial dari " + jumlahFaktorial + "! adalah " + nilaiFaktorial);
	}
	
	static void CheckPrime(String jawaban) {
		boolean primeStatus = true;
		int cekNilai;
		try {
			int[] input = new int[1];
			input[0] = Integer.parseInt(jawaban);
			for(int i = 2; i <= input[0]/2; i++) {
				cekNilai = input[0] % i;
				if(cekNilai == 0) {
					primeStatus = false;
					break;
				}
			}
			if(primeStatus && ((input[0] > 0) && (input[0] != 1))) {
				System.out.println(input[0] + " adalah bilangan prima");
			} else {
				System.out.println(input[0] + " bukan bilangan prima");
			}
		} catch (Exception e) {
			System.out.println("Angka atau string bukan bilangan prima");
		}
	}
}
