public class Main{
  public static void main(String[] args){
    Bankaccount ab1 = new Bankaccount("Dinesh", 50000);
    Bankaccount ab2 = new Bankaccount("Pappu", 40000);  
      ab1.display();

      ab1.deposit(4000);

      ab1.transfer(ab2, 1000);
      ab1.withdraw(1500);

      ab1.display();
      ab2.display();
    
  }
}