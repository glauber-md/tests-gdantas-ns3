package com.gdantas.provas.stream.impl;

import com.gdantas.provas.stream.iface.Stream;

/**
 * 
 * @author Glauber M. Dantas (glauber.md@gmail.com)
 *
 */
public class TestInputStream implements Stream {
	
	private String input;
	private int curIdx = 0;
    
	public TestInputStream(String in) {
		this.input = in;
	}
	
	/* (non-Javadoc)
	 * @see com.gdantas.provas.iface.Stream#getNext()
	 */
	@Override
	public char getNext() {
		char _ret = input.charAt(curIdx);
		curIdx++;
		return _ret;
	}

	/* (non-Javadoc)
	 * @see com.gdantas.provas.iface.Stream#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return (input != null) ? (curIdx < input.length()) : false;
	}

	/**
	 * Retorna a instância de <code>String</code> utilizada pela classe como entrada.
	 * @return the input
	 */
	public String getInput() {
		return input;
	}

	/**
	 * Configura a instância de <code>String</code> utilizada pela classe como entrada.
	 * @param input the input to set
	 */
	public void setInput(String input) {
		this.input = input;
	}
}
