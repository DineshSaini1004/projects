public class Main{
  public static void main(String[] args){
    Bankaccount ab = new Bankaccount("Dinesh", 50000);
      ab.balance = 10000;
      ab.display();

      ab.deposit(2000);

      ab.withdraw(1500);

      ab.display();
    
  }
}