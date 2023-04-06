package br.com.fiap.presenteio.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
@MappedSuperclass
public class Endereco {
    private Long cep;

    private String logradouro;

    private Long numero;

    private String bairro;

    private String cidade;

    private String estado;

    private String complemento;
}
