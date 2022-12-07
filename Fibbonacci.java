package weeek2.day1;

public class Fibbonacci {
public static void main(String[] args) {
	int firstnum=0;
	int secnum=1;
	int sum;
	System.out.println(firstnum);
	for (int i = 1; i <=8; i++) {
		sum=firstnum+secnum;
		System.out.println(sum);
		firstnum=secnum;
		secnum=sum;
		
	}
}
}
