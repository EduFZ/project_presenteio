package br.com.fiap.linkverse.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class Endereco {
    private Long cep;

    private String logradouro;

    private Long numero;

    private String bairro;

    private String cidade;

    private String estado;

    private String complemento;
}
