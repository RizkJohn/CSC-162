package labAssignment_5;

public class SavingsAccount extends BankAccount
{
  /**sends balance and interest rate to BankAccount constructor*/
  public SavingsAccount(double balance, double monthlyInterestRate)
  {
    super();
  }

  /**determines if account is active or inactive based on a minimum account balance of $25*/
  public boolean isActive()
  {
    if (balance >= 25)
      return true;
    return false;
  }

  /**checks if account is active, if it is it uses the superclass version of the method*/
  public void withdraw()
  {
    if(isActive() == true)
    {
      super.withdraw(amount);
    }
  }

  /**checks if account is active, if it is it uses the superclass version of deposit method*/
  public void deposit()
  {
    if(isActive() == true)
    {
      super.deposit(amount);
    }
  }

  /**checks number of withdrawals and adds service charge if necessary*/
  public void monthlyProcess()
  {
    if(numberOfWithdrawals > 4)
    monthlyServiceCharge++;
  }
}