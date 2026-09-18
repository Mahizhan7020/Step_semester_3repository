class MessWallet {
    private double balance;

    MessWallet(double opening) {
        if (opening < 0) {
            balance = 0;
            System.out.println("Warning: Negative opening balance. Starting at 0.");
        } else balance = opening;
    }

    void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid top-up amount.");
        } else {
            balance += amount;
            System.out.println("Balance after top-up: " + balance);
        }
    }

    void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Deducted: " + amount);
        }
    }

    double getBalance() {
        return balance;
    }
}

class Main2 {
    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(500);
        wallet.topUp(200);
        wallet.deduct(1000);
        System.out.println("Final balance: " + wallet.getBalance());
    }
}
