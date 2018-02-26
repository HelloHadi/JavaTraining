package com.Hadi.file;

import java.io.*;

class ReadConsole {
	
	   public static void main(String args[]) throws IOException {
	      InputStreamReader cin = null;

	      try {
	         cin = new InputStreamReader(System.in);
	         System.out.println("Enter characters, 'Q' to quit.");
	         char c;
	         do {
	            c =(char) cin.read();
	            System.out.print(cin.read());
	            System.out.print(c);
	         } while(c != 'Q');
	      }finally {
	         if (cin != null) {
	            cin.close();
	         }
	      }
	   }
}


