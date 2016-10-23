package kevinVaja3;
import java.io.*;

public class KevinVaja3
{
	public static void main(String[] args) throws IOException
	{
		String beseda = "";
		String besede = "";
		BufferedReader vhod = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 4; i++)
		{
			System.out.println("Vnesi besedo: ");
			beseda = vhod.readLine();
			
			if(beseda.length() >= 5)
			{
				besede = besede + beseda + " ";
			}
		}
		System.out.print(besede);
	}
}