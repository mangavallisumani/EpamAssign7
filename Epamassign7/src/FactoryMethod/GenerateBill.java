package FactoryMethod;
import java.io.*;    
class GenerateBill{  
    public static void main(String args[])throws IOException{  
    	GetCountry country = new GetCountry();  
        
      System.out.print("Enter the name of the country: ");  
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
 
      String countryName=br.readLine();  
      System.out.print("Enter the amount to change to rupees: ");  
      int amount=Integer.parseInt(br.readLine());  
  
      Plan p = country.getDetails(countryName);    
       System.out.print("Amount after conversion to rupees of country "+countryName+" is: ");  
           p.getCurreAndAmount();  
           p.calculatetoRupee(amount);  
            }  
    }