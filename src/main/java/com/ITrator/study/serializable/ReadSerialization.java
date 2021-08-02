package com.ITrator.study.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadSerialization 
{
	public static void main(String...a)
	{
		Cat cat;
		try {
			FileInputStream fis = new FileInputStream("D:/Workspace/Others/serializefile");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			cat = (Cat) ois.readObject();
			ois.close();
			
			System.out.println(cat);
			System.out.println("Success Read");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
