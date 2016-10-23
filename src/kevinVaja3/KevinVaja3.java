/*
 * 1)  napiši program, ki s standardnega vhoda sprejme poljubno besedo, ki jo vstavi na konec stavka, 
vendar samo v primeru, èe je dolžina besede veèja ali enaka 5 
zanka naj se zavrti 4 krat

opomba vezana na izpis: rešitev naj izpiše po konèanem programu. 
Besede naj bodo izpisane v eni vrstici, med besedami
naj bo en presledek

Primer: v primeru, da vnesemo besede; rdeè, balon, avto, avion je rezultat sodeè

balon avion
 */

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