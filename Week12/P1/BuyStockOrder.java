//2017112071 김응관
package Week12.P1;

public class BuyStockOrder implements Order{
    private StockTrade stock;

    public BuyStockOrder(StockTrade stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
