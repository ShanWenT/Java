import java.util.Scanner;

public class zigzag {

	public static void main(String[] args) {

		
		System.out.println("Word in ZigZag: "+getInput());

	} // end of main

	public static String getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Original word: ");
		String words = sc.nextLine().replaceAll("\\s", "").toUpperCase();
		System.out.print("Enter number of Rows: ");
		int rows = sc.nextInt();
		String zzWords;

		zzWords = printZZ(words, rows);
		sc.close();

		return zzWords;
	}

	public static String printZZ(String words, int rows) {

		int noOfDiagonal = rows - 2; // formula
		int noOfColumns = (words.length() / rows) * 2 -1; // math
		StringBuilder zzWords = new StringBuilder();

//		for (int row = 0; row < rows; row++) {
//			int columnValue = 0;
//			for (int column = 0; column < noOfColumns; column++) {
//
//				if(zzWords.length()>=words.length())
//					break;
//				else if (row % 2 != 0 && column % 2 != 0) {
//					zzWords.append(words.charAt(columnValue + row - 2));
//					if (columnValue + row <= words.length())
//						zzWords.append(words.charAt(columnValue + row));
//					column++;
//				}
//
//				else {
//					zzWords.append(words.charAt(columnValue + row));
//					if (row % 2 == 0)
//						column++;
//				}
//
//				columnValue = columnValue + noOfDiagonal + rows;
//			}
//
//		}
		
		
		for (int row = 1; row <= rows; row++) {
			int columnValue = 0;
			for (int column = 1; column <= noOfColumns; column++) {

				if(zzWords.length()>=words.length())
					break;
				
				if (column < noOfColumns) {
					zzWords.append(words.charAt(column-1));
					column++;
					
					if (columnValue + row <= words.length())
						zzWords.append(words.charAt(columnValue + row));
					column++;
				}

				else {
					zzWords.append(words.charAt(columnValue + row));
					if (row % 2 == 0)
						column++;
				}

				columnValue = columnValue + noOfDiagonal + rows;
			}

		}

		return zzWords.toString();
	}

}
