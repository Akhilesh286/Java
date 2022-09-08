public class Main {
	public static void main(String[] args) {
		String role = "Admin";
		switch (role){
		  case "Admin":
		    System.out.println("Admin");
		  break;
		  case "Moderate":
		    System.out.println("Moderate");
		  break;
		  default:
		  System.out.println("Gust");
		}
	}
}