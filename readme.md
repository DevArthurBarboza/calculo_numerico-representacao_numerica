# Output para cada arquivo

## IntClass

Menor valor passível de ser obtido: -2147483648

Maior valor passível de ser obtido: 2147483647

Quantidade de bits na representação total: 32

A representação de números do tipo Int não é feita através de ponto flutuante pois seria desperdiçado recursos para finalidades as quais não seriam usadas (parte fracionária de um número inteiro). Por conta disso é feito através do ponto fixo, o qual é determinado um número específico de casas referente a parte fracionária do número (no caso sempre 0)


## DoubleClass 

O modelo de armazenamento númerico denominado double, se caracteriza pela representação númerica através da representação de ponto flutuante porém necessitando maior processamento e armazenamento. Normalmente usado apenas para situações as quais seja necessário uma precisão alta em cálculos númericos como em sistemas financeiros, cálculos de performance de sistemas (benchmark), sistemas de simulação de física e científicos, sistemas de navegação e muitos outros

Uso do atual modelo de armazenamento numérico: Essa representação é usada quando for necessário maior precisão

Quantidade de bits na representação dos expoentes: 11

Número de casas depois da vírgula : 15

Menor valor passível de ser obtido: 2.225074e-308

Maior valor passível de ser obtido: 1.79769e+308

Quantidade de bits na representação total: 64

Exemplo - o Número 3.14159265358979323846 se convertido para double será : 3.141592653589793


## FloatClass

O modelo de armazenamento númerico denominado float, se caracteriza pela representação númerica através da representação de ponto flutuante porém de baixo poder de processamento. Esse é um ponto muito relevante pois a diferença de processamento/armazenamento entre Float e Double, pode proporcionar MegaBytes adicionais em aplicações gráficas. Placas mais antigas operam com mais facilidades através de floats, enquanto as mais novas conseguem trabalhar através do double sem muitos empecilhos. Alguns exemplos de sistemas os quais devem ser utilizar o dado em Float são : sistemas embarcados por possuírem baixos recursos disponíveis, jogos e vídeogames pois a velocidade de processamento possui maior prioridade do que uma alta precisão de informação, sistemas de comunicação em tempo real pois é necessário que apresentem uma baixa latência, e o uso de dados do tipo double dificultaria este requisito

Uso do atual modelo de armazenamento numérico: Essa representação é usada de forma geral, com menor prioridade na precisão de forma que forneça maior performance

Quantidade de bits na representação dos expoentes: 8

Número de casas depois da vírgula : 7

Quantidade de bits na representação total: 32

Menor valor passível de ser obtido: 1.1754944e-38

Maior valor passível de ser obtido: 1.7014118e+38

Exemplo - o Número 3.14159265358979323846 se convertido para float será : 3.1415927
