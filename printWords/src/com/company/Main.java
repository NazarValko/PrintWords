package com.company;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
	    String word;
	    Scanner inputDevice = new Scanner(System.in);
	    System.out.print("Введіть слово ");
	    word = inputDevice.next();

//	    char letter1 = word.charAt(0);
//		char letter2 = word.charAt(1);
//		char letter3 = word.charAt(2);
//		char letter4 = word.charAt(3);



//		char[] word1 = {' ', ' ', ' ', ' ', ' ',letter1,' ', ' ', ' ', ' ', ' ', letter2, ' ', ' ', letter3,' ', ' ', ' ', ' ', letter3,' ', ' ', ' ',' ', letter4} ;
//		char[] word2 = {' ', ' ', ' ', ' ', ' ',letter1,' ', ' ', ' ', ' ',  letter2,' ', letter2,' ', ' ', letter3,' ', ' ',  letter3,' ', ' ',' ',  letter4,' ',' ',' ', letter4} ;
//		char[] word3 = {' ', ' ', ' ', ' ', ' ',letter1,' ', ' ', ' ', letter2, ' ', ' ',' ', letter2,' ', ' ',letter3, letter3,' ', ' ',' ', letter4, ' ' ,' ',' ',' ',' ', letter4} ;
//		char[] word4 = {letter1,' ', ' ', ' ', ' ', letter1,' ', ' ',    letter2, letter2, letter2,letter2,letter2,letter2,' ', ' ',  letter3,' ',' ',' ',  letter4,letter4,letter4,letter4,letter4,letter4,letter4,} ;
//		char[] word5 = {letter1,' ', ' ', ' ', ' ', ' ', letter2, ' ', ' ', letter3,' ', ' ', ' ', ' ', letter3,' ', ' ',  letter4} ;


//		int[][] anArray1 = {
//				{0,0,0,1,0,0,0},
//				{0,0,0,1,0,0,0},
//				{0,0,0,1,0,0,0},
//				{1,0,0,1,0,0,0},
//				{1,1,1,1,0,0,0}
//		};
//		int[][] anArray2 = {
//				{0,0,0,1,0,0,0},
//				{0,0,1,0,1,0,0},
//				{0,1,0,0,0,1,0},
//				{1,1,1,1,1,1,1},
//				{1,0,0,0,0,0,1}
//		};
//		int[][] anArray3 = {
//				{1,0,0,0,0,0,1},
//				{0,1,0,0,0,1,0},
//				{0,0,1,0,1,0,0},
//				{0,0, 1,1,0,0,0},
//				{0,0,0,1,0,0,0}
//		};
//		int[][] anArray4 = {
//				{0,0,0,1,0,0,0},
//				{0,0,1,0,1,0,0},
//				{0,1,0,0,0,1,0},
//				{1,1,1,1,1,1,1},
//				{1,0,0,0,0,0,1}
//		};
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
