package com.rev.revisao;

import com.rev.revisao.model.Cachorro;
import com.rev.revisao.model.Dono;

import java.util.List;

/**
 * Classe de exemplo para testar objetos no main.
 * Pode ser usada para simulações simples fora do Spring Boot.
 */
public class App {

    public static void main(String[] args) {
        // Criando um dono
        Dono dono = new Dono(1L, "Carlos Silva", null);

        // Criando cachorros associados ao dono
        Cachorro dog1 = new Cachorro(1L, "Rex", 5, "Labrador", dono);
        Cachorro dog2 = new Cachorro(2L, "Bidu", 2, "Beagle", dono);

        // Vinculando cachorros ao dono
        dono.setCachorros(List.of(dog1, dog2));

        // Simulação de exibição
        System.out.println(dono);
    }
}
