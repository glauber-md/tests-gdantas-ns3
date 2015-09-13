# Busca primeiro caractere não repetido na stream

## Visão Geral
A aplicação Java efetua uma busca em um Stream (de texto) e localiza o primeiro caractere que não se repete.
Isto é feito seguindo os passos:
* Salvar os caracteres lidos numa lista;
* A cada novo caractere lido, verificar se ele já foi lido antes e, em caso positivo, adicionar à lista de caracteres repetidos.
* Subtrair a lista de repetidos da lista de lidos; 
* Obter o primeiro item da lista de não repetidos.

## Build
Para se efetuar o build, basta executar o comando:
> mvn compile

## Testes

### Unitário (JUnit)
A aplicação pode ser testada utilizando-se o comando:
> mvn test
