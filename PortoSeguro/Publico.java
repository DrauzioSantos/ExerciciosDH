package PortoSeguro;

public class Publico extends Telefone {

	public Publico()
	{
		super("Telefone Publico");
	}
	
	@Override
	public void toca(int numToques)
	{
		for(int i=0;i<numToques;i++);
		{
			System.out.println("\ntrimtrimtrim... trimtrimtrim");
		}
	}
	
	@Override
	public void disca(String numero)
	{
		if(numero.charAt(0)=='9' || numero.charAt(0)=='8')
		{
			System.out.println("\nEste número não liga para celular!");
		}
		else 
		{
			System.out.println("\nDiscando: "+numero);
		}
	}
}
