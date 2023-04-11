package br.com.fiap.linkverse.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonFormat(pattern="dd-MM-yyyy")
    private Date dataInicio;

    @JsonFormat(pattern="dd-MM-yyyy")
    private Date dataTermino;

    private String projetos;

    private String descFormacao;
}
