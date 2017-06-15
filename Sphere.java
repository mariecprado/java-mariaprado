public class Sphere extends Circle{
	public double calculateAreaSphere(){
		return 4 * 25.55 * 25.55 * 3.14159;
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
	 	System.out.println("Side:"+ esfera.getRadius());
	 	System.out.println("Diameter:"+ esfera.calculateDiameter());
	 	System.out.println("Circumference:"+ esfera.calculateCircumference());
	 	System.out.println("Area:"+ esfera.calculateAreaSphere());
	}

static class Circle{
		public double radius = 25.55;

		public double getRadius(){
		
			return radius;
		}
	 	
	 	public double calculateDiameter(){
	 		double diameter = radius * 2;
	 		return diameter;
	 	}

	 	public double calculateCircumference(){
	 		return calculateDiameter() * 3.14159;
	 	}

	 	public double calculateArea(){
	 		return radius * radius * 3.14159;
	 	}
	}
}