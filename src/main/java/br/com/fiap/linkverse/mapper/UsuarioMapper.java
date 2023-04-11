package br.com.fiap.linkverse.mapper;

import br.com.fiap.linkverse.request.UsuarioPostRequestBody;
import br.com.fiap.linkverse.domain.Usuario;
import br.com.fiap.linkverse.util.DateUtil;
import org.springframework.stereotype.Component;

@Component()
public class UsuarioMapper {

    DateUtil dateUtil;

    public Usuario toUsuario(UsuarioPostRequestBody usuarioPostRequestBody){
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioPostRequestBody.getNome());
        usuario.setSobrenome(usuarioPostRequestBody.getSobrenome());
        usuario.setTelefone(usuarioPostRequestBody.getTelefone());
        usuario.setEmail(usuarioPostRequestBody.getEmail());
        usuario.setGitHubLink(usuarioPostRequestBody.getGitHubLink());
        usuario.setInstagramLink(usuarioPostRequestBody.getInstagramLink());
        usuario.setFacebookLink(usuarioPostRequestBody.getFacebookLink());
        usuario.setApresentPessoal(usuarioPostRequestBody.getApresentPessoal());
        usuario.setEndereco(usuarioPostRequestBody.getEndereco());
        usuario.setFormacao(usuarioPostRequestBody.getFormacao());
        usuario.setExperiencia(usuarioPostRequestBody.getExperiencia());
        usuario.setDataNasc(usuarioPostRequestBody.getDataNasc());
        usuario.setHobbies(usuarioPostRequestBody.getHobbies());
        return usuario;
    }
}
