public class Main {
	public static void main(String[] args) {
		int Numbers = 100;
		for (int i=1;i<=100;i++){
		  if (i>=3){
		    if (i % 2 != 0) {
		      if (i%3 != 0) {
		        System.out.println(i);
		      }
		    }
		  }else {
		    System.out.println(i);
		    continue;
		  }
		}
	}
}