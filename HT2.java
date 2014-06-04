package vik1;

public class HT2 {
	char ht1,ht2,ht3;
	int n;
	
	public HT2() {
		ht1='A';
		ht2='C';
		ht3='B';
		n=3;
	}
	void move(int m, char src, char dstn, char temp){
		if (m==1){
			System.out.println(m+ " "+src+" -> "+dstn);
			}
		else {
			move(m-1,src,temp,dstn);
			System.out.println(m+" "+src+" -> "+dstn);
			move(m-1,temp,dstn,src);

		}
	}
	public static void main (String[] args){
		HT2 ht=new HT2();
		ht.move(ht.n,ht.ht1,ht.ht2,ht.ht3);
	}
}
