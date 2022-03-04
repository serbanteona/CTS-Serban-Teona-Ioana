package main;

import clase.Angajat;
import clase.AngajatReader;
import clase.Aplicant;
import clase.Reader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) throws Exception{
		List<Aplicant> listaAplicanti;
		Reader reader=new AngajatReader();

			listaAplicanti =reader.readAplicanti("angajati.txt");
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());




	}

}
