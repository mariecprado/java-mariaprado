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
		String coso = br.readLine();

	switch(coso){
		case "Register a Person":
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
		}
		break;
		case"Show the names":
		for(Map.Entry nombre: libreta.entrySet()){
			System.out.println("<"+nombre.getKey()+"> : <"+ ">");
		}
		break;
		}

		}
	}
}