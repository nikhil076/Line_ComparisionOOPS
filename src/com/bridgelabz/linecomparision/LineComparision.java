package com.bridgelabz.linecomparision;

public class LineComparision 
{
	static final int Line1x1=4,Line1x2=-3,Line1y1=-1,Line1y2=-4;
	static final int Line2x1=5,Line2x2=3,Line2y1=-5,Line2y2=3;
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Program");
		calculateLineLength();
		double resultOfLine[] = calculateLineLength();
		System.out.println("The Length os line 1 is :"+resultOfLine[0]+"\nThe Length of line 2 is :"+resultOfLine[1]);
		Double resultOfLine1 = new Double(resultOfLine[0]);
		Double resultOfLine2 = new Double(resultOfLine[1]);
		double check = resultOfLine1.compareTo(resultOfLine2);
		compareGreaterOrLessOrEqual(check);
	}
	public static double[] calculateLineLength() 
	{
		double LengthOfLine1 = Math.sqrt((Line1x2-Line1x1)*(Line1x2-Line1x1) + (Line1y2-Line1y1)*(Line1y2-Line1y1));
		double LengthOfLine2 = Math.sqrt((Line2x2-Line2x1)*(Line2x2-Line2x1) + (Line2y2-Line2y1)*(Line2y2-Line2y1));
		return new double[] {LengthOfLine1,LengthOfLine2};
	}
	public static void compareGreaterOrLessOrEqual(double value) 
	{
		if(value > 0)
        {
        	System.out.println("line 1 is greater than line 2 ");
        }
        else if (value < 0)
        {
        	System.out.println("line 1 is less than line 2 ");
        }
        else
        {
        	System.out.println("line 1 is equal to line 2");
        }
	}
}
