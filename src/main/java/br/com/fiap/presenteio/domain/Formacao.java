package br.com.fiap.presenteio.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Formacao {
    private String instituicaoEnsino;

    private String diploma;

    private String formacao;

    private Date dataInicio;

    private Date dataTermino;

    private String projetos;

    private String descFormacao;
}
