package finance.utils;

public interface MarketDataProvider {

    double getBid(String symbol);

    double getAsk(String symbol);
}