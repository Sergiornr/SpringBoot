package com.spring.demo.Controller;

import com.spring.demo.Entity.Usuario;
import com.spring.demo.Service.UsuarioService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RequestMapping("/usuario")
public class UsuarioController {


    // @Autowired
    private final UsuarioService usuarioService;


    //
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public Usuario visualizarUsuario() {
        return usuarioService.mostrarUsuario();
    }


    @GetMapping("/ver")
    public String index(Model model) {
        model.addAttribute("saludando", "Bienvenidos, esta es la vista ");
        model.addAttribute("Nombre", usuarioService.mostrarUsuario().getNombre());
        return "index";
    }


    @GetMapping("/listar")
    public String lista(Model model) {
        model.addAttribute("titulo", "Listando usuarios");
        model.addAttribute("lista", usuarioService.listarUsuario());
        return "listando";
    }
}


