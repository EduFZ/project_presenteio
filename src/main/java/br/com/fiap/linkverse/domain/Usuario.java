package br.com.fiap.linkverse.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String sobrenome;

    private Long telefone;

    private String email;

    private String gitHubLink;

    private String instagramLink;

    private String facebookLink;

    private String apresentPessoal;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date dataNasc;

    private String hobbies;

    @Embedded
    private Endereco endereco;

    @Embedded
    private Formacao formacao;

    @Embedded
    private Experiencia experiencia;
}
