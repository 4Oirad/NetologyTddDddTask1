//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.util.Random;
//
//public class TestCreditCalc {
//
//    Random random = new Random();
//    private static final double DELTA = 1e-15;
//
//    @Test
//    public void testGetMonthlyPayment() {
//        CreditCalc calc = new CreditCalc();
//        final int creditSum = random.nextInt();
//        final int creditTime = random.nextInt();
//        final int creditRate = random.nextInt();
//        final double original = calc.getMonthlyPayment();
//        final double expected = creditSum * (Math.pow(1 + creditRate/1200, creditTime) * creditRate / 1200) / (Math.pow(1 + creditRate/1200, creditTime) - 1);
//
//        Assertions.assertEquals(expected, original, DELTA);
//    }
//
//    @Test
//    public void testTotalCreditValue() {
//        CreditCalc calc = new CreditCalc();
//        final int creditSum = random.nextInt();
//        final int creditTime = random.nextInt();
//        final int creditRate = random.nextInt();
//        final double original = calc.totalCreditValue(creditSum, creditTime, creditRate);
//        final double expected = creditTime * calc.getMonthlyPayment(creditSum, creditTime, creditRate);
//
//        Assertions.assertEquals(expected, original, DELTA);
//    }
//
//    @Test
//    public void testCreditOverpayment() {
//        CreditCalc calc = new CreditCalc();
//        final int creditSum = random.nextInt();
//        final int creditTime = random.nextInt();
//        final int creditRate = random.nextInt();
//        final double expected = calc.totalCreditValue(creditSum, creditTime, creditRate) - creditSum;
//        final double original = calc.creditOverpayment(creditSum, creditTime, creditRate);
//
//        Assertions.assertEquals(expected, original, DELTA);
//    }
//}