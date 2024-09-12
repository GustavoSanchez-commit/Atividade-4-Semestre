package com.exercicio2;

public class Singleton {
    // Instância única da classe, inicialmente nula
    private static Singleton instance = null;

    // Construtor privado para evitar criação de instâncias fora da classe
    private Singleton() {
        // Pode inicializar alguns recursos se necessário
    }

    // Método para obter a instância do singleton com segurança para múltiplas threads
    public static Singleton getObject() {
        if (instance == null) { // Verificação fora do bloco synchronized para performance
            synchronized (Singleton.class) {
                if (instance == null) { // Verificação dentro do bloco synchronized para garantir segurança em multithread
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
