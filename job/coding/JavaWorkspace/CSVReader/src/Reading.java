import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

/*
 * New Commit
 * 
 * 
 * 
 * */

public class Reading {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("//home//delhivery//Downloads//SD.csv"));
		sc.next();
		while (sc.hasNext()) {
			String[] s = sc.next().split(",");
			for (int i = 1; i < 4; i++)
				if (NumberUtils.isNumber(s[i]))
					System.out.format("%-15.4f", Double.parseDouble(s[i]));
			System.out.println();
		}

		System.out.println(NumberUtils.isNumber("1.2423423434"));

		System.out.println("------------------------");
		System.out.println("------------------------");
		sc.close();
	}
}