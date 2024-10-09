import java.util.Random;

class BillCalculation {

    private Order order;
    public BillCalculation(Order order) { this.order = order; }

    public void calculateBill()
    {
        Random rand = new Random();
        int totalAmt = rand.nextInt(200) * this.order.getQuantity();

        this.order.setTotalBillAmt(totalAmt);
        System.out.println("Order with order id " + this.order.getOrderId() + " has a total bill amount of " + this.order.getTotalBillAmt());
    }
}