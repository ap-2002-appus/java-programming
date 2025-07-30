class PaymentGateway{
	public void makePayment(String cardNumber,String expirayDate,String cvv) {
		System.out.println(" Processing Credit card payment");
		System.out.println("Transaction Succefull");
		System.out.println();
	}
	public void makePayment(String upild) {
		System.out.println("UPI payment");
		System.out.println("Transaction Succefull");
		System.out.println();
	}
	public void makePayment(double amount) {
		System.out.println("Cash on Delivery");
		System.out.println("Transaction Succefull");
		System.out.println();
}
}
public class ECommerceApp {

	public static void main(String[] args) {
		PaymentGateway p1 = new PaymentGateway();
		System.out.println("payment method");
		p1.makePayment("2333333","6/2025","23");
		PaymentGateway p2 = new PaymentGateway();
		System.out.println("payment method");
		p2.makePayment("ibin@sbi");
		PaymentGateway p3 = new PaymentGateway();
		System.out.println("payment method");
		p3.makePayment("1000f");
	

	}

}
