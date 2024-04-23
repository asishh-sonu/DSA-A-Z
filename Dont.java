

import java.io.*;

class Dont {
	public static void main(String[] args)
	{
		String s1 = "java";
		s1.concat(" rules");

		// Yes, s1 still refers to "java"
		System.out.println("s1 refers to " + s1);
	}
}
