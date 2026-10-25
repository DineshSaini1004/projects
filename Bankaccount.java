class Bankaccount{
  private String accountHolder;
  double balance;

  public Bankaccount(String name, double balance){
    accountHolder = name;
    balance = balance;
  }
  public void deposit(double amount){
    if(amount > 0){
      balance = balance + amount;
      System.out.println("deposit successful");
    }else{
      System.out.println("Invalid amount");
    }
  }

    public void withdraw(double amount){
      if(amount < balance && amount > 0){
        balance = balance - amount;
        System.out.println("withdraw successful");
      }else{
        System.out.println("insufficient balance");
      }
    }

        public void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs" + balance);
    }
}

