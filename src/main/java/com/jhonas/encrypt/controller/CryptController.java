package com.jhonas.encrypt.controller;

import com.jhonas.encrypt.model.CryptModel;
import com.jhonas.encrypt.service.CryptService;
import com.jhonas.encrypt.util.CryptCesar;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


@RestController
@RequestMapping("/crypt")
public class CryptController {
    final CryptService cryptService;

    public CryptController(CryptService cryptService) {
        this.cryptService = cryptService;
    }

    @PostMapping
    public ResponseEntity<Object> saveCrypt(@RequestBody CryptModel cryptModel) {
        CryptCesar cryptCesar = new CryptCesar();
        cryptModel.setPassword(CryptCesar.encrypt(cryptModel.getPassword()));
        return ResponseEntity.status(HttpStatus.CREATED).body(cryptService.save((cryptModel)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getCrypt(@PathVariable(value = "id") Long id) {
        Optional<CryptModel> cryptModelOptional = cryptService.findById(id);
        System.out.println(CryptCesar.decrypt(cryptModelOptional.get().getPassword()));
        return ResponseEntity.status(HttpStatus.OK).body(cryptModelOptional.get());
    }

}
