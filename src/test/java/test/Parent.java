package test;

public final class Parent extends Child {

	public static void main(String[] args) {
		int year = 2020;

		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) { 
			
			
			System.out.println(year + " This is leap year");
			
			
		} else {
			
			System.out.println("this is not leap year");
		}
	}

}