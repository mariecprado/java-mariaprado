import java.io.*;
import java.util.*;

public class AddressBook {
	public static void main(String[] args)throws Exception{
	BufferedReader br = null;
	Hashtable<String, Person> libreta = new Hashtable<String, Person>();
	br = new BufferedReader(new InputStreamReader(System.in));
	Person cont;
	boolean hasJob = true;
	
	while (true){
		System.out.println("---MENU---");
		System.out.println("1. Register a person");
		System.out.println("2. Show the names");
		System.out.println("3. Show all the ages ");
		System.out.println("4. Show all the information of a specific person");
		System.out.println("What would you like to do? Choose a number");
		String coso = br.readLine();

	switch(coso){
		case "1":
		System.out.println("Register a Person");
		System.out.println("Enter your dpi:   ");
		String dpi = br.readLine();
		int dpinum = Integer.parseInt(dpi);
		if(!libreta.containsKey(dpi)){
			System.out.println("Enter your first name:   ");
			String nombre = br.readLine();
			System.out.println("Enter your lastname: ");
			String apellido = br.readLine();
			System.out.println("Enter your age: ");
			String edad = br.readLine();
			int edadnum = Integer.parseInt(edad);
			System.out.println("Do you have a job?: (yes/no) ");
			String answer = br.readLine();
			if (answer.contains("yes")){
				hasJob = true;
			}else if( answer.contains("no")){
				hasJob = false;
			}

			cont = new Person(nombre, apellido, edadnum, dpinum, hasJob);
			libreta.put(dpi, cont);
		}else{
			System.out.println("This id is from another user!");
		}
		break;
		case"2":
		System.out.println("Show the names");
		Enumeration o = libreta.keys();
		Object clave;
		while( o.hasMoreElements() ){
		  clave = o.nextElement();
		  libreta.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
		  System.out.println("<"+clave+"> : <");
		}

		break;
		case"3":
		System.out.println("Show all the ages");
		for (String name: libreta.keySet()){

            String key =name.toString();
            String value = libreta.get(name).toString();  
            System.out.println(key + " " + value);  


} 
		
		break;
		case "4":
		System.out.println("Show all the information of a specific person");
		Enumeration e = libreta.elements();
			Object valor;
			while( e.hasMoreElements() ){
			  valor = e.nextElement();
			  System.out.println( valor );
			}
		break;
		}

		}
	}
}