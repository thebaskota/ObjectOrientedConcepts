package com.thebaskota;

public class Methods {
    public static int calculateSum( int num1, int num2)
    {
        int sum;
        sum = num1 + num2;
        return sum;
    }
	
	public static void main(String[] args) {
		int a = 3, b = 5, result;
		result = calculateSum(a,b);
		System.out.println("the sum of two numbers is " + result);

	}

}
