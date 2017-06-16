public class Sphere extends Circle{
	public double calculateAreaSphere(){
		return 4 * 25.55 * 25.55 * 3.14159;
	}
	
	public double calculateDiameterS(){
		return calculateDiameter();
	}
	
	public double getRadiusS(){
		return getRadius();
	}

	public double calculateCircumferenceS(){
		return calculateDiameter();
	 }
	
	

	public static void main(String[] args){
	 	Sphere esfera = new Sphere();
	 	Circle circulo = new Circle();
	 	System.out.println("Circle Characteristics");
	 	System.out.println("Side:" + circulo.getRadius());
	 	System.out.println("Diameter:"+ circulo.calculateDiameter());
	 	System.out.println("Circumference:"+ circulo.calculateCircumference());
	 	System.out.println("Area:" + circulo.calculateArea());
	 	System.out.println("Sphere Characteristics");
	 	System.out.println("Side:"+ esfera.getRadiusS());
	 	System.out.println("Diameter:"+ esfera.calculateDiameterS());
	 	System.out.println("Circumference:"+ esfera.calculateCircumferenceS());
	 	System.out.println("Area:"+ esfera.calculateAreaSphere());
	}
}