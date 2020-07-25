package p1;

public class VideoStore {

	Video v[]=new Video[3];
	int i=0;
	public void addVideo(String title)
	{
		v[i]=new Video(title,false,0);
		i++;
	}
	
	public void checkout(String title)
	{
		boolean flag=false;
		for(Video i:v)
		{
			if(i.getTitle().equals(title))
			{
				flag=true;
				i.beingCheckedOut(title);
			}
		}
		if(flag==false)
		{
			System.out.println("Video Not Found");
		}
	}

	public void returnVideo(String title)
	{
		for(Video i:v)
		{
			if(i.getTitle().equals(title))
			{
				i.beingReturned(title);
			}
		}
	}
	
	public void recieveRating(String title,double rating)
	{
		for(Video i:v)
		{
			if(i.getTitle().equals(title))
			{
				i.recieveRating(title,rating);
			}
		}
	}
	
	public void listInventory()
	{
		for(Video i:v)
		{
			if(i.isCheckedout()==false)
			{
				System.out.println("Title of the video is "+i.getTitle()+" has rating of "+i.getRating());
			}
		}
	}
}
