public class FloatClass{

    private float example = 3.14159265358979323846f; // número usado como exemplo
    private int exponentBitsQnty = 8; // quantidade de bits para representar expoente
    private int precisionNumber = 7; // quantidade de casas após a vírgula que serão mantidas na formatação presente
    private String minValue = "1.1754944e-38"; // menor valor possível
    private String maxValue = "1.7014118e+38"; // maior valor possível
    private int bitsQnty = 32; // quantidade total de bits usada para representar o número 
    private String usage = "Essa representação é usada de forma geral, com menor prioridade na precisão de forma que forneça maior performance"; // Critério de uso
    // Mais informações abaixo
    private String summary = "\nO modelo de armazenamento númerico denominado float, se caracteriza pela representação númerica através da representação de ponto flutuante porém de baixo poder de processamento. Esse é um ponto muito relevante pois a diferença de processamento/armazenamento entre Float e Double, pode proporcionar MegaBytes adicionais em aplicações gráficas. Placas mais antigas operam com mais facilidades através de floats, enquanto as mais novas conseguem trabalhar através do double sem muitos empecilhos. Alguns exemplos de sistemas os quais devem ser utilizar o dado em Float são : sistemas embarcados por possuírem baixos recursos disponíveis, jogos e vídeogames pois a velocidade de processamento possui maior prioridade do que uma alta precisão de informação, sistemas de comunicação em tempo real pois é necessário que apresentem uma baixa latência, e o uso de dados do tipo double dificultaria este requisito";

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
        System.out.println(this.getBitsQnty());
        System.out.println(this.getMinValue());
        System.out.println(this.getMaxValue());
        System.out.println(this.getExample());
    }

    public String getExample()
    {
        return "\nExemplo - o Número 3.14159265358979323846 se convertido para float será : " + this.example;
    }

    public static void main(String[] args){
        FloatClass floatClass = new FloatClass();
        floatClass.printInfo();
    }
}