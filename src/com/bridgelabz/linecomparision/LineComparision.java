package com.bridgelabz.linecomparision;

public class LineComparision 
{
	static final int Line1x1=4,Line1x2=-3,Line1y1=-1,Line1y2=-4;
	static final int Line2x1=5,Line2x2=3,Line2y1=-5,Line2y2=3;
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Program");
//		calculateLineLength();
		double resultOfLine[] = calculateLineLength();
		System.out.println(resultOfLine[0]+"  and  "+resultOfLine[1]);
	}
	public static double[] calculateLineLength() 
	{
		double LengthOfLine1 = Math.sqrt((Line1x2-Line1x1)*(Line1x2-Line1x1) + (Line1y2-Line1y1)*(Line1y2-Line1y1));
		double LengthOfLine2 = Math.sqrt((Line2x2-Line2x1)*(Line2x2-Line2x1) + (Line2y2-Line2y1)*(Line2y2-Line2y1));
		return new double[] {LengthOfLine1,LengthOfLine2};
	}
}
