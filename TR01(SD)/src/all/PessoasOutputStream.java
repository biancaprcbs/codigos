package all;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class PessoasOutputStream extends OutputStream {
	
	private ArrayList<Pessoa> pessoas;
	
	public PessoasOutputStream() {}
	
	public PessoasOutputStream(ArrayList<Pessoa> p) {
		this.pessoas = p;
	}
	
	public void writeInSystem() {
			
		int quantPessoas = pessoas.size();
			
		System.out.println("Quantidade de pessoas enviadas: "+quantPessoas);
			
		for (Pessoa p : pessoas) {
			int tamNome = p.getNome().getBytes().length;
			String nome = p.getNome();
			double cpf = p.getCpf();
			int idade = p.getIdade();
			
			System.out.println("BytesNome: "+tamNome+"; Nome: "+nome+"; Cpf: "+cpf+"; Idade: "+idade);
		}
	}
	
	public void writeInFile() {
		
		try {
			
			OutputStream output = new FileOutputStream("./input.txt");
			
			int quantPessoas = pessoas.size();
			output.write(quantPessoas);
				
			for (Pessoa p : pessoas) {
				int tamNome = p.getNome().getBytes().length;
				output.write(tamNome);
				String nome = p.getNome();
				int index = nome.length()-1;
				while (index >= 0) {
					output.write(nome.charAt(index));
					index--;
				}
				int cpf = p.getCpf();
				output.write(cpf);
				int idade = p.getIdade();
				output.write(idade);
			}
			
			output.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void write(int b) throws IOException {
		// TODO Auto-generated method stub
	}
	
	// getters and setters

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}