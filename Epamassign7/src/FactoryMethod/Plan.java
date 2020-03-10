package FactoryMethod;      
abstract class Plan{  
         protected String currency;  
         protected Double amount;  
         abstract void getCurreAndAmount();  
   
         public void calculatetoRupee(int rup){  
              System.out.println(amount*rup);  
          }  
}  