package ExamEx1;

public class Bank {
    public double balance;
    public double rate;
    public  Bank (double balance, double rate){
        this.balance = balance;
        this.rate = rate;
    }
    public double getBalance(){
        return balance;
    }
    public  void setBalance(){
        this.balance = balance;
    }
    public double getAnnualinteresRate(){
        return rate;
    }
    public void getAnnualinteresRate(double rate){
        this.rate = rate;
    }

    public double calculateinteres(double balance, double rate){
        return  balance*(rate/1200);
    }
}
