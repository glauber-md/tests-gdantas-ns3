/**
 * 
 */
package com.gdantas.provas.stream.iface;

/**
 * @author Glauber M. Dantas glauber.md@gmail.com
 *
 */
public interface Stream {
	
	/**
	 * Obtém o próximo elemento do stream.
	 * @return o próximo elemento do stream.
	 */
	public char getNext();
	
	/**
	 * Verifica se o stream contém um próximo elemento.
	 * @return <code>true</code> se o stream é diferente de <code>null</code> e contém um próximo
	 * elemento; <code>false</code> caso contrário.
	 */
	public boolean hasNext();
}
