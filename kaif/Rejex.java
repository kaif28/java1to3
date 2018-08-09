package  rejex;

import java.util.regex.*;  
public class Rejex{  
public static void main(String args[]){  
 
Pattern p = Pattern.compile(".s"); 
Matcher m = p.matcher("as");  
boolean b = m.matches();  
  
boolean b2=Pattern.compile(".s").matcher("as").matches();  
  

boolean b3 = Pattern.matches("[789]{1}[0-9]{9}", "6887900125");  
  
System.out.println(b+" "+b2+" "+b3);  
}}
