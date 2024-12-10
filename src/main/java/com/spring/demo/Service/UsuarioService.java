package com.spring.demo.Service;

import com.spring.demo.Entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UsuarioService {


    private Usuario usuario1 = new Usuario("Luciana");


    public Usuario mostrarUsuario() {
        return usuario1;
    }

    public List<Usuario> listarUsuario() {
        List<Usuario> lista = new ArrayList<>();
        Usuario usuario2 = new Usuario("Martin");
        lista.add(usuario1);
        lista.add(usuario2);
        return lista;
    }
}

