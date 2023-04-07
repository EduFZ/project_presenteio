package br.com.fiap.presenteio.controller;

import br.com.fiap.presenteio.UsuarioPostRequestBody;
import br.com.fiap.presenteio.domain.Usuario;
import br.com.fiap.presenteio.exception.ExceptionMessage;
import br.com.fiap.presenteio.service.UsuarioService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("presenteio")
@Log4j2
@AllArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping("/save")
    public ResponseEntity<Usuario> save(@RequestBody UsuarioPostRequestBody usuarioPostRequestBody) {
        return new ResponseEntity<>(usuarioService.save(usuarioPostRequestBody), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> list(){
        return ResponseEntity.ok(usuarioService.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Integer id) throws ExceptionMessage {
        return ResponseEntity.ok(usuarioService.findByIdOrThrowBadRequestException(id));
    }

    @GetMapping("/find")
    public ResponseEntity<List<Usuario>> findByNome(@RequestParam String nome){
        return ResponseEntity.ok(usuarioService.findByNome(nome));
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) throws ExceptionMessage{
        usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
