package com.google.code.externalsorting;

/**
 * Allows to reduce equal lines
 * */
public interface Reducer {

	public String merge(String lastLine, String r);

}
