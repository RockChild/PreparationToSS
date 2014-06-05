package vik1;
public class Factorial {
	
	static int fact(int n){ 				 //recursia
	if (n==1) return 1;					 //method
		int sum=fact(n-1)*n;				 //to find
		return sum;					 //factorial
	}
	int fact_recurent(int n){
		int sum=1;					//recurent
		for(int i=1;i<=n;i++)				//algorithm
			sum=i*sum;				//to find
		System.out.println(n+"! = "+ sum); 		//factorial
		return sum;
	}
	
	public static void main(String[]args){
		int n=5;
		System.out.println(n+"! = "+ fact(n));		//calling 1-th method
		System.out.println(n+"! = "+fact_recurent(n));	//calling 2-nd method
	}
}
