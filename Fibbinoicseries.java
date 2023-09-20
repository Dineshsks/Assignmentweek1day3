package week2day3;

public class Fibbinoicseries {
	public static void main(String[] args) {
int n1=0,n2=1,sum=0;
System.out.println(n1+" "+n2);
System.out.println("The Fibbinocci Series");
for(int i=1;i<11;i++) {
	sum=n1+n2;
	System.out.println(" "+sum);
	n1=n2;
	n2=sum;
}



}
	}


