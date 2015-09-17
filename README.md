# Busca primeiro caractere não repetido na stream

### Licença
<a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-nd/4.0/88x31.png" /></a><br />This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a>.

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
