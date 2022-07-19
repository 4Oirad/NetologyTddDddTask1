public class Main {

    public static void main(String[] args) {
        CreditCalc calc = new CreditCalc(300000, 24, 10);
        System.out.println("Ваш ежемесячный платеж: " + (int) calc.getMonthlyPayment() + " руб.");
        System.out.println("Общая стоимость кредита: " + (int) calc.totalCreditValue() + " руб.");
        System.out.println("Переплата за весь период: " + (int) calc.creditOverpayment() + " руб.");
    }
}