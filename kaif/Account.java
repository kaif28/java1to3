package polymorphismexample;

public class Account {
    int bal;
    
    public Account()
    {
        bal=1000;
    }
    public Account(int bal)
    {
        this.bal=bal;
    }
    public Account(Account t)       //Copy Constructor
    {
        this.bal=t.bal;
    }

    public int getBal() {
        return bal;
    }
}
