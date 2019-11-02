class Franc extends Money{  
   private String currency;
 
   Franc(int amount, String currency){      
       super(amount, currency)
   }
					
   Money times(int multiplier){      
      return new Money.franc(amount * multiplier);					
   }   				
}
