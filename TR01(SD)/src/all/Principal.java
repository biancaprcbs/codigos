package all;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa pessoa01 = new Pessoa("Maria Clara", 493959, 25);
		Pessoa pessoa02 = new Pessoa("Carlos", 469394, 30);
		Pessoa pessoa03 = new Pessoa("Ricardo", 694020, 22);
		Pessoa pessoa04 = new Pessoa("Marilia Oliveira", 302050, 48);
		
		pessoas.add(pessoa01);
		pessoas.add(pessoa02);
		pessoas.add(pessoa03);
		pessoas.add(pessoa04);
		
		PessoasOutputStream POS = new PessoasOutputStream(pessoas);
		POS.writeInSystem();
		POS.writeInFile();
		
		InputStream input = new FileInputStream("./input.txt");
		
		PessoasInputStream IS = new PessoasInputStream(input);
		
		IS.readFromFile();	
	}
}