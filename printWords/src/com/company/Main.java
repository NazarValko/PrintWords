package com.company;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
	    String word;
	    Scanner inputDevice = new Scanner(System.in);
	    System.out.print("Введіть слово ");
	    word = inputDevice.next();






		int[][] anArray1 = {
				{0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0},
				{0,0,0,1,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,1,0,0,0,0,1,0,1,0,0},
				{0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,1,0},
				{1,0,0,1,0,0,1,1,1,1,1,1,1,0,0,0, 1,1,0,0,0,0,1,1,1,1,1,1,1},
				{1,1,1,1,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,1}
		};

		for (int i = 0; i < 5; i++) {  //идём по строкам
			for (int j = 0; j < 29; j++) {//идём по столбцам
				if (anArray1[i][j] == 0) {
					anArray1[i][j] = ' ';
					System.out.print(anArray1[i][j]); //вывод элемента
				}
			}

			System.out.println();
		}
	}
}
