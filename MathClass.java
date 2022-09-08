public class Main {
	public static void main(String[] args) {
	  //Math.round(1.1F);
	  int result = Math.round(1.1F);
	  System.out.println(result);
	  System.out.println("########");
	  int a = (int)Math.ceil(1.1F);
	  System.out.println(a);
	  System.out.println("########");
	  int b = (int)Math.floor(1.1F);
	  System.out.println(b);
	  System.out.println("########");
	  int c = (int)Math.max(1,2);
	  System.out.println(c);
	  System.out.println("########");
	  int d = (int)Math.min(1,5);
	  System.out.println(d);
	  System.out.println("########");
	  double e = (int)Math.random();
	  System.out.println(e);
	  System.out.println("########");
	  double f = (int)Math.random()*100;
	  System.out.println(f);
	  System.out.println("########");
	  double r = Math.round(Math.random()*100);
	  System.out.println(r);
	  System.out.println("########");
	  int r2 = (int)Math.round(Math.random()*100);
	  System.out.println(r2);
	  System.out.println("########");
	  int r3 = (int) (Math.random()*100);
	  System.out.println(r3);
	  System.out.println("########");

	}
}