package com.Hadi.file;

import java.io.*;

public class CopyFile1 {
	
	   public static void main(String args[]) throws IOException {
	      FileReader in = null;
	      FileWriter out = null;

	      try {
	         in = new FileReader("C:\\Users/One/Desktop/14022018\\input.txt");
	         out = new FileWriter("C:\\Users/One/Desktop/14022018\\moremoreoutput.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) { //reach end of file = ascii value -1, in read as ascii,
	            out.write(c); //out method output the value to character
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
	}


