/**
 * 
 */
package com.gdantas.provas.run;

import java.util.ArrayList;
import java.util.List;

import com.gdantas.provas.exception.CharNotFoundException;
import com.gdantas.provas.stream.iface.Stream;
import com.gdantas.provas.stream.impl.TestInputStream;

/**
 * Classe de teste para prova de conhecimento em Java.
 * @author Glauber M. Dantas (glauber.md@gmail.com)
 *
 */
public class FindNoRepeatingCharOnStream {
	
	/**
	 * Busca o primeiro caractere que não se repete em um dado <code>Stream</code>.
	 * @param input
	 * @return o caractere encontrado
	 * @throws CharNotFoundException quando não é encontrado nenhum caractere que não se repita no <code>Stream</code>.
	 */
	public static char firstChar(Stream input) throws CharNotFoundException {
		List<Character> readChars = new ArrayList<>();
		List<Character> repeatedChars = new ArrayList<>();
		while(input.hasNext()) {
			char cur = input.getNext();
			if(!readChars.isEmpty() && readChars.contains(cur))
				repeatedChars.add(cur);
			readChars.add(cur);
		};
		readChars.removeAll(repeatedChars);
		if(readChars.isEmpty())
			throw new CharNotFoundException("Caractere que não se repete não encontrado no stream.");
		
		return readChars.get(0);
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(FindNoRepeatingCharOnStream.firstChar(new TestInputStream("aAbBABac")));
		} catch (CharNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
