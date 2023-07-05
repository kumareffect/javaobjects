public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public void depositFund(Integer depositAmount){
        accountBalance += depositAmount;
        System.out.println("Your amount "+ depositAmount +"$ has been deposited successfully your account Balance is now " + accountBalance + "$");
    }

    public void withdrawFund(double withdrawAmount){
        if(accountBalance - withdrawAmount < 0){
            System.out.println("You can't withdraw amount as your accnount balance "+accountBalance+"$ is less than "+withdrawAmount+"$");
        }
        else {
            accountBalance -= withdrawAmount;
            System.out.println("Your withdrawl of "+withdrawAmount+"$ is successful and now your new account balance is "+accountBalance+"$");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
