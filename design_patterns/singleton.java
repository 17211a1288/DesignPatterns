package design_patterns;
public class singleton {
	static singleton obj=null;
	String s;
	singleton(){ s="Hi"; }
	public static singleton get()
	{
		if(obj==null)
		{
			obj=new singleton();
		}
		return obj;
	}
}
