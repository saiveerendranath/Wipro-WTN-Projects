package p1;

public class VideoStoreLauncher {

	public static void main(String args[])
	{
		VideoStore vs=new VideoStore();
		vs.addVideo("God Father Part II");
		vs.addVideo("Good Fellas");
		vs.addVideo("Inception");
		System.out.println("1st");
		vs.listInventory();
		
		vs.checkout("Inception");
		System.out.println("2nd");
		vs.listInventory();
		
		vs.returnVideo("Inception");
		vs.recieveRating("Inception",4.5);
		vs.recieveRating("God Father Part II",4.8);
		System.out.println("3rd");
		vs.listInventory();
		
		
		
	}
}
