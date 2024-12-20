public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        CoinChoice coinChoice = new CoinChoice();
        ExchangeRateAPI api = new ExchangeRateAPI();
        api.fetchExchangeRate();

        /*display.welcomeMessage();
        display.convertMessage();
        display.choiceCoinMessage();
        coinChoice.firstCoinOption();*/

    }
}
