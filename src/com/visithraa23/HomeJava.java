package com.visithraa23;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeJava {
	static Scanner sc = new Scanner(System.in);
	static boolean exit = true;

	public static void main(String[] args) throws Exception {

		String path = "C:\\Users\\ELCOT\\Desktop\\Git Folder\\JavaConsoleApplication\\src\\com\\visithraa23"; 
		List<String> packages = new ArrayList<>();

		Files.walk(Paths.get(path)).forEach(filePath -> {
			if (Files.isDirectory(filePath)) {
				packages.add(filePath.getFileName().toString());
			}
		});

		do {
			System.out.println("Select a package:\n");
			int i;
			for (i = 1; i < packages.size(); i++) {
				System.out.println((i) + "." + packages.get(i) + " Programs");
			}
			System.out.println(packages.size() + "." + "Exit\n");
			int packageNum = sc.nextInt();
			if (packageNum == packages.size()) {
				exit = false;
			} else if (packageNum < packages.size() && packageNum > 0) {
				String packageName = packages.get(packageNum);
				System.out.println(packageName);
				boolean b=true;
				do {
					String className = findClasses(path + "\\" + packageName);
					
					if(className=="exit")
						b=false;
					else
						invokeClass(className,packageName);
				} while (b);
			} else {
				System.out.println("Wrong Package");
			}

		} while (exit);
	}

	private static void invokeClass(String className, String packageName) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		Class<?> clsName=Class.forName("com.visithraa23."+packageName+"."+className);
		//System.out.println(className);
		Object obj=clsName.getDeclaredConstructor().newInstance();
		Method method=clsName.getMethod("main",String[].class);
		String[] args=null;
		method.invoke(obj,(Object)args);
		
	}

	private static String findClasses(String packageNameWithPath) throws MalformedURLException {
		String selectedClassName ="";
		
			File file = new File(packageNameWithPath);
			URL url = file.toURI().toURL();
			URL[] urls = new URL[] { url };
			ClassLoader classLoader = new URLClassLoader(urls);
			File[] files = file.listFiles();

			int classNumber = 1;
			if (files != null) {
				System.out.println("Classes\n");
				for (File f : files) {
					if (f.isFile() && f.getName().endsWith(".java")) {
						String fileName = f.getName();
						String classNames = fileName.substring(0, fileName.lastIndexOf('.'));
						System.out.println(classNumber + "." + classNames);
						classNumber++;
					}
				}
				System.out.println(classNumber + "." + "exit");

				System.out.println("\nSelect the class");
				int classNum = sc.nextInt();
				if(classNum==files.length) {
					selectedClassName="exit";
				}
				
				else if (classNum > 0 && classNum < classNumber) {
					String selectedClass = files[classNum - 1].getName();
					selectedClassName = selectedClass.substring(0, selectedClass.lastIndexOf('.'));

				} else {
					selectedClassName="exit";
					System.out.println("Class not found");
				}
			}
		
		
		return selectedClassName;
	}
}