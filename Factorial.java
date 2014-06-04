package vik1;
public class Factorial {
	
	static int fact(int n){      //рекурсивний 
	if (n==1) return 1;			 //метод 
		int sum=fact(n-1)*n;	 //пошуку 
		return sum;				 //факторіалу
	}
	
	public static void main(String[]args){
		int n=5;
		System.out.println(n+"! = "+ fact(n));//звернення до методу-рекурсії
		
		int sum=1;							//рекурентний	
		for(int i=1;i<=n;i++)				//алгоритм
			sum=i*sum;						//пошуку
		System.out.println(n+"! = "+ sum);	//факторіалу
		

	}
}
