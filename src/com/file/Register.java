package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Register {
	
	public void register() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR USERID: ");
		int uid = sc.nextInt();
		System.out.println("ENTER YOUR PASSWORD: ");
		String pass = sc.next();
		Dto d = new Dto(uid, pass);
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		ArrayList<HashMap<Integer, String>> al = new ArrayList<HashMap<Integer,String>>();
//		al.add(0,hm);
		//m1(al);
		m2(d);
	}
	
	public static void m2(Dto d) {
		File path = new File("C:\\Users\\user\\Documents\\Register.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		ArrayList<HashMap<Integer, String>> al = null;
		try {
			fis = new FileInputStream(path);
			ObjectInputStream in = new ObjectInputStream(fis);
			al = (ArrayList<HashMap<Integer, String>>)in.readObject();
			HashMap<Integer, String> hm = al.get(0);
			hm.put(d.getUserId(), d.getPassword());
			//hm.clear();
			al.add(0,hm);
			fos = new FileOutputStream(path);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(al);
			fis.close();
			fos.close();
		}  catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
//	public static void m1(ArrayList<HashMap<Integer, String>> al) {
//	File path = new File("C:\\Users\\user\\Documents\\HCS.txt");
//	FileOutputStream fos = null;
//	try {
//		fos = new FileOutputStream(path);
//		ObjectOutputStream out = new ObjectOutputStream(fos);
//		out.writeObject(al);
//	} catch(Exception ex) {
//		ex.printStackTrace();
//	}
//}
	
}
