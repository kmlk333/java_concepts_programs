package com.ITrator.study.practice.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteSerialization 
{
	public static void main(String...a)
	{
		Cat cat = new Cat(15);
		cat.dobb = 1221;
		cat.d = 11111;
		try {
			FileOutputStream fos = new FileOutputStream("D:/Workspace/Others/serializefile");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cat);
			System.out.println("Success");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
