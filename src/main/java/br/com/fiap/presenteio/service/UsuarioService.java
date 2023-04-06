package br.com.fiap.presenteio.service;

import br.com.fiap.presenteio.UsuarioPostRequestBody;
import br.com.fiap.presenteio.domain.Usuario;
import br.com.fiap.presenteio.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public Usuario save(UsuarioPostRequestBody usuarioPostRequestBody) {
        return usuarioRepository.save(Usuario.builder()
                .nome(usuarioPostRequestBody.getNome())
                .sobrenome(usuarioPostRequestBody.getSobrenome())
                .telefone(usuarioPostRequestBody.getTelefone())
                .email(usuarioPostRequestBody.getEmail())
                .gitHubLink(usuarioPostRequestBody.getGitHubLink())
                .instagramLink(usuarioPostRequestBody.getInstagramLink())
                .facebookLink(usuarioPostRequestBody.getFacebookLink())
                .apresentPessoal(usuarioPostRequestBody.getApresentPessoal())
                .endereco(usuarioPostRequestBody.getEndereco())
                .formacao(usuarioPostRequestBody.getFormacao())
                .experiencia(usuarioPostRequestBody.getExperiencia())
                .dataNasc(usuarioPostRequestBody.getDataNasc())
                .hobbies(usuarioPostRequestBody.getHobbies())
                .build());
    }

    public List<Usuario> listAll() {
        return usuarioRepository.findAll();
    }
}
