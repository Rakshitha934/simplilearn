package com.caltech.BusinessLevelOperations;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.caltech.Lockedme.FileInterface;

public class BusinessLevelOperations implements FileInterface {
	
	
	public void showAllFiles()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Path:");
	String path=sc.nextLine();
	System.out.println("enter the file name");
	String filename=sc.nextLine();
	File file=new File(path);
	//display operation
	File filename[]=file.listFiles();
	//for-each
	System.out.println("the list of files in asscending order in the "+ path +"is");
	for(File ff:filename) {
		System.out.println(ff.getName());
	}
	}
	public void addFile() throws IOException 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Path:");
		String path=sc.nextLine();
		System.out.println("enter the file name");
		String filename=sc.next();
		String finalpath=path+filename;
		System.out.println(finalpath);
		//create a file
		File file=new File(finalpath);
		boolean res=file.createNewFile();
		if(res!=true) {
			System.out.println("file is not created");
		}
		else {
			System.out.println("file is created ");
		}
		
	}

	public  void deleteFile() 
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Path:");
	String path=sc.nextLine();
	System.out.println("enter the file name");
	String filename=sc.next();
	String finalpath=path+filename;
	System.out.println(finalpath);
	
	File file=new File(finalpath);
	//delete operation
	file.delete();
	System.out.println("file gets deleted");
	
}

	
	public void searchFile() 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Path:");
		String path=sc.nextLine();
		System.out.println("enter the file to search");
		String filenamesearch=sc.next();
		File file=new File(path);
		//display operation
		File filename[]=file.listFiles();
		//for-each
		int flag=0;
		for(File ff:filename) {
			if(ff.getName().equals(filenamesearch)) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		
		if(flag==1) {
			System.out.println("file is found");
		}
		else {
			System.out.println("file is not found");
		}
		
		
	}
}

	

