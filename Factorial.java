package vik1;
public class Factorial {
	
	static int fact(int n){      //����������� 
	if (n==1) return 1;			 //����� 
		int sum=fact(n-1)*n;	 //������ 
		return sum;				 //���������
	}
	
	public static void main(String[]args){
		int n=5;
		System.out.println(n+"! = "+ fact(n));//��������� �� ������-������
		
		int sum=1;							//�����������	
		for(int i=1;i<=n;i++)				//��������
			sum=i*sum;						//������
		System.out.println(n+"! = "+ sum);	//���������
		

	}
}
