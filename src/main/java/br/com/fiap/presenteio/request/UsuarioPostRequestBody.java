package br.com.fiap.presenteio.request;

import br.com.fiap.presenteio.domain.Endereco;
import br.com.fiap.presenteio.domain.Experiencia;
import br.com.fiap.presenteio.domain.Formacao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioPostRequestBody {

    private String nome;

    private String sobrenome;

    private Long telefone;

    private String email;

    private String gitHubLink;

    private String instagramLink;

    private String facebookLink;

    private String apresentPessoal;

    private Date dataNasc;

    private String hobbies;

    @Embedded
    private Endereco endereco;

    @Embedded
    private Formacao formacao;

    @Embedded
    private Experiencia experiencia;
}
