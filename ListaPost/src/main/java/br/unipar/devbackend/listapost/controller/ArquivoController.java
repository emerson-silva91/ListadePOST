package br.unipar.devbackend.listapost.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
@RequestMapping("/arquivos")

public class ArquivoController {
    @PostMapping(value = "/upload", consumes = "multipart/form-data")
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {

        if (!file.getOriginalFilename().endsWith(".pdf"))
            return "Arquivo precisa ser PDF!";

        Path destino = Paths.get("uploads/" + file.getOriginalFilename());
        Files.copy(file.getInputStream(), destino, StandardCopyOption.REPLACE_EXISTING);

        return "PDF enviado com sucesso!";
    }

}
