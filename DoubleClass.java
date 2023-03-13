public class DoubleClass{

    private double example = 3.14159265358979323846; // número usado como exemplo
    private int exponentBitsQnty = 11; // quantidade de bits para representar expoente
    private int precisionNumber = 15; // quantidade de casas após a vírgula que serão mantidas na formatação presente
    private String minValue = "2.225074e-308"; // menor valor possível
    private String maxValue = "8.988466e+307"; // maior valor possível
    private int bitsQnty = 64; // quantidade total de bits usada para representar o número 
    private String usage = "Essa representação é usada quando for necessário maior precisão"; // Critério de uso
    // Mais informações abaixo
    private String summary = "\nO modelo de armazenamento númerico denominado double, se caracteriza pela representação númerica através da representação de ponto flutuante porém necessitando maior processamento e armazenamento. Normalmente usado apenas para situações as quais seja necessário uma precisão alta em cálculos númericos como em sistemas financeiros, cálculos de performance de sistemas (benchmark), sistemas de simulação de física e científicos, sistemas de navegação e muitos outros"; 

    public String getExponentBitsQnty(){
        return "\nQuantidade de bits na representação dos expoentes: " + this.exponentBitsQnty;
    }

    public String getMinValue(){
        return "\nMenor valor passível de ser obtido: " + this.minValue;
    }

    public String getMaxValue(){
        return "\nMaior valor passível de ser obtido: " + this.maxValue;
    }

    public String getBitsQnty(){
        return "\nQuantidade de bits na representação total: " + this.bitsQnty;
    }

    public String getUsage(){
        return "\nUso do atual modelo de armazenamento numérico: " + this.usage;
    }

    public String getSummary()
    {
        return this.summary;
    }


    public void printInfo()
    {
        System.out.println(this.getSummary());
        System.out.println(this.getUsage());
        System.out.println(this.getExponentBitsQnty());
        System.out.println(this.getMinValue());
        System.out.println(this.getMaxValue());
        System.out.println(this.getBitsQnty());
        System.out.println(this.getExample());
    }

    public String getExample()
    {
        return "\nExemplo - o Número 3.14159265358979323846 se convertido para double será : " + this.example;
    }
    public static void main(String[] args){
        DoubleClass doubleClass = new DoubleClass();
        doubleClass.printInfo();
    }
}