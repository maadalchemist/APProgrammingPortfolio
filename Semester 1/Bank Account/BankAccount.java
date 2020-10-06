/**
* The BankAccount class stores bank account info
* as well as methods to interact with that data
*
* @author  Joseph Wardle
* @version 1.0
* @since   2020-10-06
*/
public class BankAccount {
  private double balance;
  private double transactionFee;
  private double monthlyCharge;
  private int    transactionCount;

  public BankAccount(){
    this.balance         = 0;
    this.transactionFee  = .10;
    this.monthlyCharge   = 0;
    this.transationCount = 0;
  }
  public BankAccount(int _initialDeposit) {
    this.balance         = _initialDeposit;
    this.transactionFee  = .10;
    this.monthlyCharge   = 0;
    this.transationCount = 0;
  }

  /**
  * This method is used to add to the account balance
  * @param _amount This is the value to be added to the account balance
  */
  public void deposit(double _amount) {
    this.balance += _amount;
    this.transactionCount ++;
  }

  /**
  * This method is used to subtract from the account balance
  * @param _amount This is the value to be subtracted the account balance
  */
  public void withdrawl(double _amount) {
    this.balance -= _amount;
    this.transactionCount ++;
  }

  /**
  * This method is used to find the account balance
  * @return returns the account balance
  */
  public double getBalance() {
    return this.balance;
  }

  /**
  * This method is used to set a new transaction fee
  * @param _fee this is the value the fee is set to (in decimal form)
  */
  public void setTransactionFee(double _fee) {

  }

  /**
  * This method subtracts the monthly account fee from the account balance
  */
  public void deductMonthlyCharge() {

  }
}

// JavaDoc for class and all methods with proper @params and @returns
// All member variable use encapsulation for at least tracking a balance, transaction, freeTransaction, transactionFee etc
// 2 constructors (one to open a $0 balance free account and one to open a custom amount fee based account)
// Methods must include:
//   deposit(double amount)
//   withdrawal(double amount)
//   getBalance()
//   setTransactionFee(double fee)
//   deductMonthlyCharge()
// Use of "this" keyword in at least one of the methods (hint: see deposit method in the text (Links to an external site.))
// Tester class to simulate account setup with EVERY method call included

// In this project, you will enhance the BankAccount class and see how abstraction and encapsulation enable evolutionary changes to software.
// Begin with a simple enhancement: charging a fee for every deposit and withdrawal. Supply a mechanism for setting the fee and modify the deposit and withdraw methods so that the fee is levied. Test your class and check that the fee is computed correctly.
// Now make a more complex change. The bank will allow a fixed number of free transactions (deposits or withdrawals) every month, and charge for transactions exceeding the free allotment. The charge is not levied immediately but at the end of the month.
// Supply a new method deductMonthlyCharge to the BankAccount class that deducts the monthly charge and resets the transaction count. (Hint: Use Math.max(actual transaction count, free transaction count) in your computation.)
// Produce a test program that verifies that the fees are calculated correctly over several months.
