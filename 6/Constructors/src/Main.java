public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account();

        bobsAccount.setAccountNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerEmailAddress("bobsemail@email.com");
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerPhoneNumber("401-555-5555");

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
    }
}
