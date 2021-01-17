package expinterface;

public class child1 extends ParentClass1 implements parent1 ,Parent2{

	/*@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("child show");
		
	}*/
public static void main (String[]args) {
	parent1 ch= new child1();
	ch.show();
}
}
