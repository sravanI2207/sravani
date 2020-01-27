package pack;

public class BeansClass1 
{
	private String message;

	public void getMessage() {
	System.out.println("Message:"+message);
	}

	public void setMessage(String message) {
	this.message = message;
	}
	public void init()
	{
	System.out.println("This is inside init");
	}
	public void destroy()
	{
	System.out.println("This is inside destroy");
	}

}
