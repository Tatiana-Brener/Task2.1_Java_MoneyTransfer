public class MoneyTransfer {
    public static void main(String[] args) {
        int current_balance = 2_000_000_000;
        int transfer_amount = 500_000_000;
        int total = current_balance + transfer_amount;
        System.out.println("Total account balance=" + total);
    }
}
