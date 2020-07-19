package design_patterns;

import java.util.logging.Logger;

public class creation {
	private static  final Logger LOGGER=Logger.getLogger(creation.class.getName());
	public static void main(String args[])
	{
		singleton x=singleton.get();
		LOGGER.info("STRING VALUE IN X:");
		LOGGER.info(x.s);
	}
}
