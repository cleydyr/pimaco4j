# pimaco4j
Biblioteca para facilitar a obtenção das dimensões de várias etiquetas da Pimaco

## Como usar
Adicione a dependência no seu pom.xml
```
<groupId>com.github.cleydyr</groupId>
<artifactId>pimaco4j</artifactId>
<version>1.0-SNAPSHOT</version>
```

Todas as medidas retornadas pelos métodos são do tipo `Quantity<Length>`. Você pode consultar [os javadocs da classe Quantity](http://unitsofmeasurement.github.io/unit-api/site/apidocs/javax/measure/Quantity.html) ou simplesmente usar o método `getValue()` encadeado com `doubleValue()` para trabalhar com tipos primitivos. Por exemplo:

```java
Quantity<Length> measure = PimacoTagSheet.A4349.getHorizontalMargin();
double d = measure.getValue().doubleValue();
```
