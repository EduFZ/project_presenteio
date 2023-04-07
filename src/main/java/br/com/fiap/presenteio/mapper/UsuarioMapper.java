package br.com.fiap.presenteio.mapper;

import br.com.fiap.presenteio.UsuarioPostRequestBody;
import br.com.fiap.presenteio.domain.Usuario;
import org.springframework.stereotype.Component;

@Component()
public class UsuarioMapper {
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
