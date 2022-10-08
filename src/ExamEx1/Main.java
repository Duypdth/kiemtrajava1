package ExamEx1;
import static java.lang.String.format;
public class Main {
    public static void main(String[] args){
        Bank banks = new Bank(43000000, 10.5);
        double interest = banks.calculateinteres(banks.balance, banks.rate);
        System.out.println("So lai hien tai cua ban la:" + format("%.2f", interest) + "$");
    }
}