/**
 * Created by 111 on 23.04.2016.
 */
public class main {
    public  static  void main(String args[]){
Bank a =new Bank("MyBank1");
a.show();

        Bank.Account a1 = a.new Account("1234 5678 9876 5432","+1000000$","1000$","100$");

        a1.acnumberShow();
        a1.balanceShow();
        a1.takeMoney();
        a1.put();

    }

}

