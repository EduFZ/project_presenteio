package br.com.fiap.presenteio.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class Experiencia {
    private String cargo;

    private String tipoContrato;

    private String nomeEmpresa;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "cep", column = @Column(name = "cepEmpresa")),
            @AttributeOverride(name = "logradouro", column = @Column(name = "logradouroEmpresa")),
            @AttributeOverride(name = "numero", column = @Column(name = "numeroEmpresa")),
            @AttributeOverride(name = "bairro", column = @Column(name = "bairroEmpresa")),
            @AttributeOverride(name = "cidade", column = @Column(name = "cidadeEmpresa")),
            @AttributeOverride(name = "estado", column = @Column(name = "estadoEmpresa")),
            @AttributeOverride(name = "complemento", column = @Column(name = "complementoEmpresa"))
    })
    private Endereco enderecoEmpresa;

    private Date dataInicioEmp;

    private Date dataTerminoEmp;

    private Boolean trabalhoAtual;

    private String setor;

    private String descTrabalho;

    private String competenciasCargo;
}
