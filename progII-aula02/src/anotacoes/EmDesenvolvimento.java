package anotacoes;

public @interface EmDesenvolvimento {

    String value();

    enum Importancia {
        CRITICO, IMPORTANTE, TRIVIAL
    };

    Importancia importancia() default Importancia.IMPORTANTE;
}
