package vik1;

public class Fibonacci {
	
	 static int fib(int i){
		if (i==0) return 0;
		if (i==1) return 1;
		int p=fib(i-1)+fib(i-2);
		return p;		
	}
	 
	 public static void main(String[] args){
		 int n=10;
	
		 int F[]=new int[n];			
		 for (int i=0;i<n;i++){			//рекурсивний варіант
			 F[i]=fib(i);				//хоча він все одно використовує цикл
			 System.out.print(F[i]+" ");//і тормознутий(якщо n більше 40)
		 }
		 System.out.println();
		 int f[]=new int[n];
		 System.out.print((f[0]=0) +" ");//перші 2 елементи
		 System.out.print(f[1]=1);		 //дефолтні тому й визначив їх
		 
		 for (int i=2; i<n;i++){			//рекурентний
			 f[i]=f[i-1]+f[i-2];			// алгоритм
			 System.out.print(" "+f[i]);
		 }
	 }
}
