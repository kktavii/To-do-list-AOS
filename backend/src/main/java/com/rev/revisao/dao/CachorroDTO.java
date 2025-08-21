package com.rev.revisao.dao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO = Data Transfer Object
 * Usado para transferir dados do cachorro sem expor a entidade inteira (modelo de domínio).
 */
@Data // Gera getters, setters, toString, equals, e hashCode
@NoArgsConstructor // Construtor vazio (obrigatório para serialização/deserialização)
@AllArgsConstructor // Construtor com todos os argumentos
public class CachorroDTO {

    @NotNull(message = "O nome não pode ser nulo")
    @NotBlank(message = "O nome não pode estar em branco")
    @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres")
    private String nome;

    @NotNull(message = "A idade é obrigatória")
    private Integer idade;

    @NotBlank(message = "A raça é obrigatória")
    private String raca;

    @NotNull(message = "O ID do dono é obrigatório")
    private Long donoId;

    // Construtores gerados pelas anotações do Lombok acima
    // Métodos como getNome(), setIdade(), etc., também são gerados automaticamente.
}
