package br.mil.fab.alteracao_bt.api.api_alteracao_bt.controller;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.Usuario;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/confirmar-login")
    public boolean confirmarLogin(@RequestParam String usuario, @RequestParam String senha) {
        Usuario user = usuarioRepository.findByUsuario(usuario);
        if (user.getSenha().equals(senha)) {
            return true;
        }
        else {
            return false;
        }

    }
}
