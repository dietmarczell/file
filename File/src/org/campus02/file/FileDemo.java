package org.campus02.file;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("D:\\temp");
		System.out.println(dir.isFile() + " , " + dir.getPath() + " " + dir.canWrite() + " " + dir.canRead() + " " + dir.exists() + " " + dir.length());
		
	}

}
