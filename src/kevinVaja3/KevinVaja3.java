/*
 * 1)  napi�i program, ki s standardnega vhoda sprejme poljubno besedo, ki jo vstavi na konec stavka, 
vendar samo v primeru, �e je dol�ina besede ve�ja ali enaka 5 
zanka naj se zavrti 4 krat

opomba vezana na izpis: re�itev naj izpi�e po kon�anem programu. 
Besede naj bodo izpisane v eni vrstici, med besedami
naj bo en presledek

Primer: v primeru, da vnesemo besede; rde�, balon, avto, avion je rezultat sode�

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