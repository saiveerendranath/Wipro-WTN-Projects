package p1;

public class Video {

	private String title;
	private boolean checkedout;
	private double rating;
	
	Video()
	{
		
	}
	
	Video(String title, boolean checkedout, double rating)
	{
		this.title=title;
		this.checkedout=checkedout;
		this.rating=rating;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCheckedout() {
		return checkedout;
	}

	public void setCheckedout(boolean checkedout) {
		this.checkedout = checkedout;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public void beingCheckedOut(String title)
	{
		setCheckedout(true);
	}
	
	public void beingReturned(String title)
	{
		setCheckedout(false);
	}
	
	public void recieveRating(String title,double rating)
	{
		setRating(rating);
	}
	
}
