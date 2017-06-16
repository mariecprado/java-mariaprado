public class Circle{
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