package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.helloworldmvc.Contract.IModel;

public class Model implements IModel{
	
	public BufferedReader lecteurAvecBuffer = null;
	public String ligne;

	public String getHelloWorld() throws IOException {
		
		lecteurAvecBuffer = new BufferedReader(new FileReader("HelloWorld.txt"));
		ligne = lecteurAvecBuffer.readLine();
				
		return ligne;
		
	}
	

}
