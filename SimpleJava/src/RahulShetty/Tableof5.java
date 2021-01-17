package RahulShetty;

public class Tableof5 {
	
	public void multipicationTable(int i) {
		for(int j=1;j<=10;j++) {
		System.out.printf("%d*%d=%d," ,i,j,i*j).println();}
	}
	
		public void printStar(int i) {
		
		for(int k=1;k<=i;k++) {
			System.out.printf("*").println();
			
			for (int j=1;j<=k;j++) {
			System.out.printf("*");
			
			}
		}
		
		}
		public void sum( int a,int b ) {
			int c=a+b;
		System.out.printf("%d+%d=%d",a,b,c);
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Tableof5 tb=new Tableof5();
	tb.multipicationTable(6);
	tb.printStar(8);
	tb.sum(5, 7);
	}
 
}
