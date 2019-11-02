class Money  {
   protected int amount;
   String currency;

   static Money dollar(int amount){
      return new Money(amount, "USD");
   }   

   static Money franc(int amount){
      return new Money(amount, "CHF");
   }

   Money(int amount, String currency){
      this.amount = amount;
      this.currency = currency;
   }

   Money times(int multiplier){
      return new Money(amount * multiplier, currency);
   }

   String currency(){
      return currency;
   }

   public boolean equals(Object object)  {
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());
   }  
}
