/**
 * Created by 111 on 23.04.2016.
 */
public class Bank {
public String bname;
    public Bank(String bname) {
        this.bname = bname;
    }

    public class Account //inner class
    {
        public String acnumber;
        public String balance;
        public String sum;
        public String sum1;

        public Account(String acnumber, String balance,String sum, String sum1) {
            this.acnumber = acnumber;
            this.balance = balance;
            this.sum=sum;
            this.sum1=sum1;
        }


        public void acnumberShow(){

            System.out.println("Номер счета: "+acnumber);
        }
        public void balanceShow(){

            System.out.println("Баланс счета: "+balance);
        }
        public void takeMoney() {

            System.out.println("Какую сумму вы хотите снять? "+sum );
        }
        public void put(){

            System.out.println("Какую сумму вы хотите внести? "+sum1);
        }

    }
    public void show()
    {
        System.out.println("Банк  "+bname);
    }
}
