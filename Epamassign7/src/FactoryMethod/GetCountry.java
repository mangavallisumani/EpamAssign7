package FactoryMethod;
class GetCountry{  
       public Plan getDetails(String planType){  
            if(planType == null){  
             return null;  
            }  
          if(planType.equalsIgnoreCase("England")) {  
                 return new England();  
               }   
           else if(planType.equalsIgnoreCase("GERMANY")){  
                return new Germany();  
            }   
          else if(planType.equalsIgnoreCase("USA")) {  
                return new Usa();  
          }  
      return null;  
   }  
}