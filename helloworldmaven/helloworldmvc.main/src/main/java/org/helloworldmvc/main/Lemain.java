package org.helloworldmvc.main;


import java.io.IOException;

import org.helloworldmvc.controller.Controller;
import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;

public class Lemain {

	public static void main(String[] args) throws IOException {
		
		Model a = new Model();	
		View b = new View();	
		Controller c = new Controller(b, a);
		
		c.run();
	}

}

