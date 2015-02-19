class Prompt {

boolean keepBuying;
Console prompt;
Bank transaction; 
Calculator calculator;

   public static void main(String[] args)
   {
       prompt = new Console();
        while(keepBuying) {
            if(!hasUser){
               prompt.getName();
               prompt.getMoney();
            }
           prompt.buysell();   // ask the user to buy or sell stock
	   prompt.getStockName();
           prompt.getShares();
           transaction.handleTransaction();
           calculator.claculate();
           prompt.ask();   // ask user to buy more stock
           //Now using my mac
        }
   }

}
