import java.util.Scanner;
class natural{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++){
			sum=sum+i;
		}
		System.out.println("sum of natural numbers:"+sum);
	}
}