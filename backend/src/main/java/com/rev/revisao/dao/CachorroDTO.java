package com.rev.revisao.dao;

import com.rev.revisao.model.Cachorro;
import java.util.ArrayList;
import java.util.List;

public class CachorroDAO {
    private List<Cachorro> banco = new ArrayList<>();

    public void adicionar(Cachorro cachorro) {
        banco.add(cachorro);
        System.out.println("Cachorro adicionado: " + cachorro.getNome());
    }

    public List<Cachorro> listarTodos() {
        return banco;
    }

    public Cachorro buscarPorId(int id) {
        for (Cachorro c : banco) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public boolean remover(int id) {
        Cachorro cachorro = buscarPorId(id);
        if (cachorro != null) {
            banco.remove(cachorro);
            System.out.println("Cachorro removido: " + cachorro.getNome());
            return true;
        }
        return false;
    }
}
