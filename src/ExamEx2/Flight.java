package ExamEx2;

public class Flight {
    private int number;
    private String destination;
    public Flight(){
        this.number = 0;
        this.destination = "";
    }
    public Flight (int filightNumber, String destination) {
        if (filightNumber > 0) {
            if (destination != ""){
                this.number = filightNumber;
                this.destination = destination;
            } else {
                this.number = 0;
                this.destination = "";
            }
        } else {
            this.number = 0;
            this.destination = "";
        }
    }
    public int getNumber(){
        return number;
    }
    public String getDestination(){
        return destination;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    void display(){
        System.out.println("Thong tin chuyen bay:");
        System.out.println("So hieu:" + number);
        System.out.println("Chuyen bay:" + destination);
    }
}
