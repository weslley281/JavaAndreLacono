package Dia1;

public class Tabuada {
    String calcularTabuada(Integer primeiroNumero, Integer segundoNumero) {
        if (primeiroNumero == null || segundoNumero == null) {
            throw new IllegalArgumentException("Os números não podem ser nulos.");
        }

        if (segundoNumero > 10 || primeiroNumero > 10) {
            throw new IllegalArgumentException("O número deve ser menor ou igual a 10.");
        } else if (segundoNumero < 0 || primeiroNumero < 0) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a zero.");
        } else {
            Integer resultado = primeiroNumero * segundoNumero;

            return new StringBuilder()
                    .append(primeiroNumero)
                    .append(" x ")
                    .append(segundoNumero)
                    .append(" = ")
                    .append(resultado)
                    .toString();
        }
    }
}