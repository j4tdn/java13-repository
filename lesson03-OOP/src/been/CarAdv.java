package been;

public class CarAdv {
		
		// static >> initial value when class is being loaded
		// non-static >> initial value when initial an object from class
		
		// static things will be created before non-static things
		public static String model;

		private String color;
		
		public CarAdv() {
		}

		public CarAdv(String color) {
			this.color = color;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
		//static >> non- static
		public static void exportCarInfo() {
			System.out.println(model);
			//System.out.println(color);
			//exportCarInfo();
			
		}
		
		public void printCarInfo() {
			System.out.println(model);
			System.out.println(color);
			exportCarInfo();
		}

		@Override
		public String toString() {
			return model + ", " + color;
		}
		
	}

