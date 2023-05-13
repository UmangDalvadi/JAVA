// package Oops;

public class get_set {
    public static void main(String[] args) {
        Account a1=new Account();
        Account a2=new Account();

        a1.setuser("umang");
        a1.setpass(4321);
        
        System.out.println(a1.getuser());
        System.out.println(a1.getpass());
        
        a2.setuser("vikash");
        a2.setpass(1234);
        
        System.out.println(a2.getuser());
        System.out.println(a2.getpass());
    }
}

class Account{
    public String user;
    private int pass;

    public String getuser()
    {
        return this.user;
    }
    public int getpass()
    {
        return this.pass;
    }

    public void setuser(String user)
    {
        this.user=user;
    }
    public void setpass(int pass)
    {
        this.pass=pass;
    }


}