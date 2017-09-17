package suresh;

abstract class Abstract_sideclass {
	
		
	abstract void numofSides();
	
	}
	class Trapezoid extends Testside_abstract
	{
		void numofSides()
		{
			System.out.println("Number of Sides of Trapezoid = 4");
		}
	}

	class Triangle extends Testside_abstract
	{
		void numofSides()
		{
			System.out.println("Number of Sides of Triangle = 3");
		}
	}

	class Hexagon extends Testside_abstract
	{
		void numofSides()
		{
			System.out.println("Number of Sides of Hexagon = 6");
		}


}
