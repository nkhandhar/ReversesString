package com.greenapex.gkadmin.admin.domain.controller;

// TODO: Auto-generated Javadoc
/**
 * The Class ReverseController.
 */
public class ReverseController {
    
    /**
     * The main method.
     *
     *@author Nilay
     * @param args the arguments
     */
    public static void main(String args[]) {
    
        String word = "Band";
        String reverse = reverse(word);
        System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
    }   
  
 
    /**
     * Reverse.
     *
     *@author Nilay
     * @param source the source
     * @return the string
     */
    public static String reverse(String source){
        
        
        if(source == null || source.isEmpty()){
            return source;
        }       
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
      
        return reverse;
    }



}
