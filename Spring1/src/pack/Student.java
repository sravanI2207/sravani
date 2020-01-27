/*package pack;

public class Student
{
	private int Sid;
	private String sname;  
	
	public int getSid() 
	{
		return Sid;
	}

    public void setSid(int sid) 
	{
		Sid = sid;
	}

    public String getSname() 
	{
		return sname;
	}

    public void setSname(String sname)
	{
		this.sname = sname;
	}

    public Student() 
	{
		super();
		
	}

    public Student(int sid, String sname)
    {
		super();
		Sid = sid;
		this.sname = sname;
    }

    public void display()
	{  
	    System.out.println( "Sid :"+this.Sid+"\n "+"sname :"+this.sname);  
	}  

}*/
package pack;

import java.util.*;

public class Student 
{
	private int sid;
	private String sname;
	private List Mobile;
	public void display()
	{
	System.out.println("Sid : "+this.sid+" \n"+"Sname : "+this.sname+"\n ");
	Iterator i= Mobile.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	}
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public String getSname() 
	{
		return sname;
	}
	public void setSname(String sname)
	{
		this.sname = sname;
	}
	public List getMobile()
	{
		return Mobile;
	}
	public void setMobile(List mobile)
	{
		Mobile = mobile;
	}
	

   
}

