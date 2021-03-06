//************************************************************************
// File: Parser.java         Final Project
//
// Author: <name>          Email: <your email>
//
// Class: Parser
// Dependencies:
//
// Description  :  <insert>
//
//
//
//
//
//************************************************************************
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Collection;
import java.util.Iterator;

public class Parser {

	//reads the test file, at least to start with
	public static String infile = "test.txt";
	//public static

	//number of lines in the file
  	public static int N = 16;

  	//initialize array for
    public static String[]     ID;
    public static String[]     TEXT;
    public static String[]       TIME;

  public static void main(String[] args) {
		loadMsg(infile);
  }

  public static void loadMsg(String filename) {

        Scanner input = null;
        // File IO with exception handling
        try {
            input = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + filename);
            System.exit(1);
        }

        //WHILE LOOP DETERMINES HOW MANY MESSAGES THERE ARE (so we can make an array with the right size)
       // do {
       // 	N++;
       // 	System.out.println(N);
       // }
       // while (input.hasNextLine());

        //initialize the arrays we are going to use
        ID   = new String[N];
        TIME = new String[N];
		TEXT = new String[N];

        for (int i = 0; i < N; i++) {
             String line = input.nextLine();

             // splits up the line into first and second parts using the | divider
             String[] tokens = line.split(" | ");

            //adds the first part of the 2-part array to location i in array taskNames[]
             ID[i] = tokens[0];
             System.out.print("ID: " + ID[i] + " | ");

             //the second element in the array is the date/time
             TIME[i] = tokens[1];
						 System.out.print("TIME: " + TIME[i] + " | ");

						 TEXT[i] = tokens[3];
						 System.out.print("TEXT: " + TEXT[i] + "\n");

        } // end of for loop

        input.close();
    } // end of loadTasks

}
