/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package madlibs;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author NiCha7897
 * Modified by Kaune 10/03/2016
 */
public class MadLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            File textFile = new File("Y:\\NetBeansProjects\\MadLibs\\story.txt");
		FileReader in;
		BufferedReader readFile;
		String lineOfText;
		
		try {
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
    		while ((lineOfText = readFile.readLine()) != null ) {
    			System.out.println(lineOfText);
    		}
    		readFile.close();
    		in.close();
            } catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
    		System.err.println("IOException: " + e.getMessage());
    }
    
}
}