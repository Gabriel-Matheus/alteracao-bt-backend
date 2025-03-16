package br.mil.fab.alteracao_bt.api.api_alteracao_bt.controller;

import br.mil.fab.alteracao_bt.api.api_alteracao_bt.model.User;
import br.mil.fab.alteracao_bt.api.api_alteracao_bt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/confirmar-login")
    public boolean confirmarLogin(@RequestParam String usuario, @RequestParam String senha) {
        User user = userRepository.findByUsuario(usuario);
        if (user == null || user.getSenha() == null || user.getSenha().isEmpty()) {
            return false;
        }
        return user.getSenha().equals(senha);
    }
}
