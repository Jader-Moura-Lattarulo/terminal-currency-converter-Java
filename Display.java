public class Display {
    private final String border = "****************************************************";
    private final int totalWidth = border.length();

    private void setBorder(String message){
        String[] lines = message.split("\n");

        System.out.println(border);

        for (String line : lines) {
            int textLength = line.length();
            int padding = (totalWidth - textLength) / 2;
            String leftPadding = " ".repeat(3);
            String rightPadding = " ".repeat(totalWidth - textLength - padding + padding - 5);
            System.out.println("*" + leftPadding + line + rightPadding + "*");
        }
    }

    public void welcomeMessage(){
        setBorder("Bem-Vindo(a) ao Conversor de Moedas");
    }

    public void convertMessage(){
        String choiceCoinMessage = choiceCoinMessage();
        setBorder(String.format("""
                Escolha a moeda que deseja converter:
                %s
                """, choiceCoinMessage));
    }

    public void convertTo(){
        String choiceCoinMessage = choiceCoinMessage();
        setBorder(String.format("""
                Para qual moeda deseja fazer a conversão:
                %s
                """, choiceCoinMessage));
    }

    public String choiceCoinMessage(){
        return """
        1-  DÓLAR AMERICANO
        2-  EURO
        3-  IENE
        4-  LIBRA ESTERLINA
        5-  FRANCO SUÍÇO
        6-  DÓLAR CANADENSE
        7-  DÓLAR AUSTRALIANO
        8-  RAND
        9-  YUAN
        10- PESO ARGENTINO
        11- REAL
        12- SAIR
        """;
    }

    public void firstCoinMessage(String coin) {
        setBorder(coin);
    }

    public void whichAmount(String firstCoin, String secondCoin) {
        setBorder(String.format("""
                Entre com o valor que deseja converter de:
                %s para %s
                """, firstCoin, secondCoin));
    }
}
