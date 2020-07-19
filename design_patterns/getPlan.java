package design_patterns;

public class getPlan {
	public plan get(String s)
	{
		if(s.equalsIgnoreCase("domestic")) 
			return new domestic();
		else if(s.equalsIgnoreCase("commercial")) 
			return new commercial();
		return null;
	}
}
