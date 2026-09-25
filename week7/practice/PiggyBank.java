class PiggyBank {
    private int savings;
    private final String id;
    PiggyBank(String id){
        this.id=id;
        this.savings=0;
    }
    public void deposit(int amount){
        if(amount>0) savings+=amount;
    }
    public void withdraw(int amount){
        if(amount<=savings) savings-=amount;
    }
    public int getSavings(){
        return savings;
    }
    public String getId(){
        return id;
    }
}
