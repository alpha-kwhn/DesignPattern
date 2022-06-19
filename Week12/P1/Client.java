//2017112071 김응관
package Week12.P1;

public class Client {
    public static void main(String[] args) {
        StockTrade stock = new StockTrade();
        BuyStockOrder buyStockOrder = new BuyStockOrder(stock);
        SellStockOrder sellStockOrder = new SellStockOrder(stock);
        Agent agent = new Agent();

        agent.placeOrder(buyStockOrder); // Buy Shares
        agent.placeOrder(sellStockOrder); // Sell Shares
    }
}
