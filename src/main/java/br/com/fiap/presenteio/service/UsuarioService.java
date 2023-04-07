package br.com.fiap.presenteio.service;

import br.com.fiap.presenteio.request.UsuarioPostRequestBody;
import br.com.fiap.presenteio.domain.Usuario;
import br.com.fiap.presenteio.exception.ExceptionMessage;
import br.com.fiap.presenteio.mapper.UsuarioMapper;
import br.com.fiap.presenteio.repository.UsuarioRepository;
import br.com.fiap.presenteio.request.UsuarioPutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    UsuarioMapper usuarioMapper;

    @Transactional
    public Usuario save(UsuarioPostRequestBody usuarioPostRequestBody) {
        return usuarioRepository.save(usuarioMapper.toUsuario(usuarioPostRequestBody));
    }

    public List<Usuario> listAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findByIdOrThrowBadRequestException(Integer id) throws ExceptionMessage {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new ExceptionMessage("Anime not Found"));
    }

    public List<Usuario> findByNome(String nome) {
        return usuarioRepository.findByNome(nome);
    }

    public void delete(Integer id) throws ExceptionMessage{
        usuarioRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public Usuario replace(Integer id, UsuarioPutRequestBody usuarioPutRequestBody) throws ExceptionMessage{
        Usuario newUsuario = findByIdOrThrowBadRequestException(id);
        newUsuario.setNome(usuarioPutRequestBody.getNome());
        newUsuario.setSobrenome(usuarioPutRequestBody.getSobrenome());
        newUsuario.setTelefone(usuarioPutRequestBody.getTelefone());
        newUsuario.setEmail(usuarioPutRequestBody.getEmail());
        newUsuario.setGitHubLink(usuarioPutRequestBody.getGitHubLink());
        newUsuario.setInstagramLink(usuarioPutRequestBody.getInstagramLink());
        newUsuario.setFacebookLink(usuarioPutRequestBody.getFacebookLink());
        newUsuario.setApresentPessoal(usuarioPutRequestBody.getApresentPessoal());
        newUsuario.setEndereco(usuarioPutRequestBody.getEndereco());
        newUsuario.setFormacao(usuarioPutRequestBody.getFormacao());
        newUsuario.setExperiencia(usuarioPutRequestBody.getExperiencia());
        newUsuario.setDataNasc(usuarioPutRequestBody.getDataNasc());
        newUsuario.setHobbies(usuarioPutRequestBody.getHobbies());
        return usuarioRepository.save(newUsuario);
    }

}
