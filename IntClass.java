public class IntClass{

    private String info = "\nA representação de números do tipo Int não é feita através de ponto flutuante pois seria desperdiçado recursos para finalidades as quais não seriam usadas (parte fracionária de um número inteiro). Por conta disso é feito através do ponto fixo, o qual é determinado um número específico de casas referente a parte fracionária do número (no caso sempre 0)";
    private String minValue = "-2147483648"; // menor valor possível
    private String maxValue = "2147483647"; // maior valor possível
    private int bitsQnty = 32; // quantidade total de bits usada para representar o número 

    public String getMinValue(){
        return "\nMenor valor passível de ser obtido: " + this.minValue;
    }

    public String getMaxValue(){
        return "\nMaior valor passível de ser obtido: " + this.maxValue;
    }

    public String getBitsQnty(){
        return "\nQuantidade de bits na representação total: " + this.bitsQnty;
    }

    public void printInfo()
    {
        System.out.println(this.getMinValue());
        System.out.println(this.getMaxValue());
        System.out.println(this.getBitsQnty());
        System.out.println(this.info);
    }

    public static void main(String[] args){
        IntClass intClass = new IntClass();
        intClass.printInfo();
    }
}