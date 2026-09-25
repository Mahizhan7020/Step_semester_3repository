class Cart {
    private double[] prices;
    private int count;
    private final String id;
    Cart(String id,int size){
        this.id=id;
        prices=new double[size];
        count=0;
    }
    public void addItem(double price){
        if(count<prices.length) prices[count++]=price;
    }
    public double getTotal(){
        double sum=0;
        for(int i=0;i<count;i++) sum+=prices[i];
        return sum;
    }
    public int getItemCount(){
        return count;
    }
    public String getId(){
        return id;
    }
}
