package com.rev.revisao.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "cachorros") // Nome da tabela no banco
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cachorro {

    @Id // Identificador único da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 2, max = 50)
    private String nome;

    @NotNull(message = "A idade é obrigatória")
    private Integer idade;

    @NotBlank(message = "A raça é obrigatória")
    private String raca;

    @ManyToOne(fetch = FetchType.LAZY) // Muitos cachorros para um dono
    @JoinColumn(name = "dono_id", nullable = false) // Nome da FK na tabela
    private Dono dono;

    // Construtores, Getters e Setters são gerados automaticamente pelo Lombok.
}
