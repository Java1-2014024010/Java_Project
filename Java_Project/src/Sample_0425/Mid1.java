package Sample_0425;

public class Mid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 8; i >= 1; i--) {
			for (int j = 1; j <= 6; j++) {
				if (j >= 5 && i >= 5)
					break;
				if ((i == 6 && j == 4) || (i == 5 && j == 4))
					j += 2;
				if ((i == 1 && j == 4 || (i == 1 && j == 5))) {
					System.out.print("    ");
					continue;
				}
				System.out.print(i + "0" + j + " ");
			}
			System.out.println(" ");
		}
		System.out.println("<<ÇÐ¹ø : 2014024010>>");

	}
	}


