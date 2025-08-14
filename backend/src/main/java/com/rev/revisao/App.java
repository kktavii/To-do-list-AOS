package com.rev.revisao;

import com.rev.revisao.model.Cachorro;
import com.rev.revisao.model.Dono;
import com.rev.revisao.dao.CachorroDAO;

public class App {
    public static void main(String[] args) {
        Dono dono1 = new Dono(1, "Carlos Silva", "99999-1111");
        Dono dono2 = new Dono(2, "Maria Souza", "98888-2222");

        CachorroDAO cachorroDAO = new CachorroDAO();

        cachorroDAO.adicionar(new Cachorro(1, "Rex", "Labrador", 5, dono1));
        cachorroDAO.adicionar(new Cachorro(2, "Luna", "Poodle", 3, dono2));

        System.out.println("\n--- Lista de Cachorros ---");
        for (var c : cachorroDAO.listarTodos()) {
            System.out.println(c);
        }

        System.out.println("\n--- Buscar por ID 1 ---");
        System.out.println(cachorroDAO.buscarPorId(1));

        System.out.println("\n--- Removendo ID 2 ---");
        cachorroDAO.remover(2);

        System.out.println("\n--- Lista Atualizada ---");
        for (var c : cachorroDAO.listarTodos()) {
            System.out.println(c);
        }
    }
}