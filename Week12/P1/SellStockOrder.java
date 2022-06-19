//2017112071 김응관
package Week12.P1;

public class SellStockOrder implements Order{
    private StockTrade stock;

    public SellStockOrder(StockTrade stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
