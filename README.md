# Desafio: Análise de vendas (Projeto de Estudo)
Você deve ler um arquivo .csv contendo uma base de dados de registros
de venda, e instanciar na memória uma lista de objetos do tipo Sale,
conforme projeto ao lado (Atenção: não use tipos primitivos int e double
nos atributos e métodos! Use os tipos wrapper Integer e Double,
conforme mostrado no projeto).

Base de dados .csv esta nesse diretorio.

Depois de ler os dados, seu programa deverá mostrar as seguintes análises (implemente o método toString
da classe Sale para facilitar):

    * Cinco primeiras vendas de 2016 de maior preço médio, ordenadas decrescentemente por preço médio<br/>
    * Valor total vendido pelo vendedor Logan nos meses 1 e 7 de qualquer ano<br/>

Atenção: use métodos Stream + lambda para extrair os resultados a partir da lista original.<br/>
Atenção: caso ocorra alguma falha na leitura do arquivo, a exceção deve ser tratada, e mostrada uma mensagem conforme exemplo.<br/>

**EXEMPLO 1 (CONSIDERANDO QUE A BASE DE DADOS ACIMA ESTA NO DIRETORIO REFERIDO):**

Entre o caminho do arquivo: c:\temp\in.csv

Cinco primeiras vendas de 2016 de maior preço médio<br/>
9/2016, Kal-El, 23, 20530.29, pm = 892.62<br/>
7/2016, Kal-El, 20, 17126.62, pm = 856.33<br/>
3/2016, Kal-El, 25, 21099.27, pm = 843.97<br/>
6/2016, Padme Amidala, 25, 16429.74, pm = 657.19<br/>
1/2016, Logan, 12, 7625.55, pm = 635.46<br/>

Valor total vendido pelo vendedor Logan nos meses 1 e 7 = 45357.42

**EXEMPLO 2:**

Entre o caminho do arquivo: c:\temp\in<br/>
Erro: c:\temp\in (O sistema não pode encontrar o arquivo especificado)<br/>