import java.util.LinkedList;

public class Person {
	private String nombre;
    private String apellido;
    private int edad;
    private int dpi;
    private boolean hasJob;
	
	
	/*private LinkedList<String> copyLkdList(LinkedList<String> original) {
		LinkedList<String> nueva = new LinkedList<String>();
		for (int i=0; i<original.size(); i++) {
			nueva.add(original.get(i));
		}
		return nueva;
	}*/
			
	
	public Person(String nom, String apellido, int edad, int dpi, boolean hasJob) {
		this.nombre = new String(nom);
		this.apellido = new String(apellido);
		this.edad = edad;
		this.dpi = dpi;
		this.hasJob = hasJob;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int addEdad() {
		return this.edad;
	}
	
	public int addDpi() {
		return this.dpi;
	}

	public boolean getJobStatus() {
		return hasJob;
	}

	public String toString() {
		 String 
			s = " <" + this.nombre+" > ";
				s += " < " + this.apellido +" > ";
				s += " < " + this.edad +" > ";
		if (hasJob = true ){
			s += " < has job > ";
		}else{
			s+= "<hasn't job>";
		}
		return s;
	}
}