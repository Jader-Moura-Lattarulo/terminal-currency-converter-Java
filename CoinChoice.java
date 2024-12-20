import java.util.Scanner;

public class CoinChoice {
    Display display = new Display();
    Scanner scanner = new Scanner(System.in);

    public void firstCoinOption(){
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                display.firstCoinMessage("DÓLAR AMERICANO");
                display.convertTo();
                secondCoinOption("DÓLAR AMERICANO");
                break;
            case "2":
                display.firstCoinMessage("EURO");
                display.convertTo();
                secondCoinOption("EURO");
                break;
            case "3":
                display.firstCoinMessage("IENE");
                display.convertTo();
                secondCoinOption("IENE");
                break;
            case "4":
                display.firstCoinMessage("LIBRA ESTERLINA");
                display.convertTo();
                secondCoinOption("LIBRA ESTERLINA");
                break;
            case "5":
                display.firstCoinMessage("FRANCO SUÍÇO");
                display.convertTo();
                secondCoinOption("FRANCO SUÍÇO");
                break;
            case "6":
                display.firstCoinMessage("DÓLAR CANADENSE");
                display.convertTo();
                secondCoinOption("DÓLAR CANADENSE");
                break;
            case "7":
                display.firstCoinMessage("DÓLAR AUSTRALIANO");
                display.convertTo();
                secondCoinOption("DÓLAR AUSTRALIANO");
                break;
            case "8":
                display.firstCoinMessage("RAND");
                display.convertTo();
                secondCoinOption("RAND");
                break;
            case "9":
                display.firstCoinMessage("YUAN");
                display.convertTo();
                secondCoinOption("YUAN");
                break;
            case "10":
                display.firstCoinMessage("PESO ARGENTINO");
                display.convertTo();
                secondCoinOption("PESO ARGENTINO");
                break;
            case "11":
                display.firstCoinMessage("REAL");
                display.convertTo();
                secondCoinOption("REAL");
                break;
            case "12":
                display.firstCoinMessage("SAIR");
                break;
            default:
                display.firstCoinMessage("OPÇÃO INVÁLIDA, ESCOLHA NOVAMENTE.");
                firstCoinOption();
                break;
        }
    }

    public void secondCoinOption(String firstCoin){
        String userChoice = scanner.nextLine();

        String secondCoin;

        switch (userChoice) {
            case "1":
                display.firstCoinMessage("DÓLAR AMERICANO");
                secondCoin = "DÓLAR AMERICANO";
                display.whichAmount(firstCoin, secondCoin);
                break;
            case "2":
                display.firstCoinMessage("EURO");
                secondCoin = "EURO";
                display.whichAmount(firstCoin, secondCoin);
                break;
            case "3":
                display.firstCoinMessage("IENE");
                secondCoin = "IENE";
                display.whichAmount(firstCoin, secondCoin);
                break;
            case "4":
                display.firstCoinMessage("LIBRA ESTERLINA");
                secondCoin = "LIBRA ESTERLINA";
                display.whichAmount(firstCoin, secondCoin);
                break;
            case "5":
                display.firstCoinMessage("FRANCO SUÍÇO");
                secondCoin = "FRANCO SUÍÇO";
                display.whichAmount(firstCoin, secondCoin);
                break;
            case "6":
                display.firstCoinMessage("DÓLAR CANADENSE");
                secondCoin = "DÓLAR CANADENSE";
                display.whichAmount(firstCoin, secondCoin);
                break;
            case "7":
                display.firstCoinMessage("DÓLAR AUSTRALIANO");
                secondCoin = "DÓLAR AUSTRALIANO";
                display.whichAmount(firstCoin, secondCoin);
                break;
            case "8":
                display.firstCoinMessage("RAND");
                secondCoin = "RAND";
                display.whichAmount(firstCoin, secondCoin);
                break;
            case "9":
                display.firstCoinMessage("YUAN");
                secondCoin = "YUAN";
                display.whichAmount(firstCoin, secondCoin);
                break;
            case "10":
                display.firstCoinMessage("PESO ARGENTINO");
                secondCoin = "PESO ARGENTINO";
                display.whichAmount(firstCoin, secondCoin);
                break;
            case "11":
                display.firstCoinMessage("REAL");
                secondCoin = "REAL";
                display.whichAmount(firstCoin, secondCoin);
                break;
            case "12":
                display.firstCoinMessage("SAIR");
                break;
            default:
                display.firstCoinMessage("OPÇÃO INVÁLIDA, ESCOLHA NOVAMENTE.");
                secondCoinOption(firstCoin);
                break;
        }
    }
}
