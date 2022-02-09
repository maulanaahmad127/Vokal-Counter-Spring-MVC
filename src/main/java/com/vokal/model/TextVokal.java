package com.vokal.model;

import java.util.HashSet;
import java.util.Set;

public class TextVokal {

    private String textInput;

    public String getTextInput() {
        return textInput;
    }

    public void setTextInput(String textInput) {
        this.textInput = textInput;
    }
    public String getVokal(){
        Set<Character> vokal = new HashSet<Character>();

    	char[] hurufVokal = {'a', 'i', 'u', 'e', 'o'};

    	for(int i = 0; i < textInput.length(); i++){

        	for(int j = 0; j < hurufVokal.length; j++){

            	if(textInput.toLowerCase().charAt(i) == hurufVokal[j]){

                	vokal.add(hurufVokal[j]);

            	}

        	}

  	  }

    	return "\"" + textInput + "\"" + " = " + vokal.size() + " yaitu " + vokal.toString();

    }
    
}
