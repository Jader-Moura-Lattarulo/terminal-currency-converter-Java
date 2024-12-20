import java.util.ArrayList;
import java.util.List;

public class CoinsList {
    private List<String> coinList;

    private void MyCoinList() {
        coinList = new ArrayList<>();
        coinList.add("DÓLAR AMERICANO");
        coinList.add("EURO");
        coinList.add("IENE");
        coinList.add("LIBRA ESTERLINA");
        coinList.add("FRANCO SUÍÇO");
        coinList.add("DÓLAR CANADENSE");
        coinList.add("DÓLAR AUSTRALIANO");
        coinList.add("RAND");
        coinList.add("YUAN");
        coinList.add("PESO ARGENTINO");
        coinList.add("REAL");
        coinList.add("SAIR");
    }

    public List<String> getCoinList() {
        return coinList;
    }
}
