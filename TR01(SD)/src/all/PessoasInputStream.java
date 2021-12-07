package all;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class PessoasInputStream extends InputStream {
	
	private InputStream IS;
	
	public PessoasInputStream() {}
	
	public PessoasInputStream(InputStream pIS) {
		this.IS = pIS;
	}
	
	public void readFromFile() {
		
		try {
			
			int data = IS.read();
			
			while (data != -1) {
				System.out.println((char) data);
				data = IS.read();
			}
			
			IS.close();
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// get and set

	public InputStream getIS() {
		return IS;
	}
	public void setIS(InputStream iS) {
		IS = iS;
	}

	@Override
	public int read() throws IOException {
		return 0;
	}
}