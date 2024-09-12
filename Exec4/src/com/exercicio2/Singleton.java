package com.exercicio2;

public class Singleton {
    // Inst�ncia �nica da classe, inicialmente nula
    private static Singleton instance = null;

    // Construtor privado para evitar cria��o de inst�ncias fora da classe
    private Singleton() {
        // Pode inicializar alguns recursos se necess�rio
    }

    // M�todo para obter a inst�ncia do singleton com seguran�a para m�ltiplas threads
    public static Singleton getObject() {
        if (instance == null) { // Verifica��o fora do bloco synchronized para performance
            synchronized (Singleton.class) {
                if (instance == null) { // Verifica��o dentro do bloco synchronized para garantir seguran�a em multithread
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
