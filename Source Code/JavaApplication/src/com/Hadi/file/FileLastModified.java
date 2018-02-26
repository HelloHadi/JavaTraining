package com.Hadi.file;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileLastModified {
	
	    public static void main(String a[]) {
	         
	        File file = new File("test.txt");
	        System.out.println(file.lastModified()); //last modified method count second from 1 jan 1970

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		System.out.println("After Format : " + sdf.format(file.lastModified()));
	    }
	 
}


