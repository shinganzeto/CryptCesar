package com.jhonas.encrypt.service;

import com.jhonas.encrypt.model.CryptModel;
import com.jhonas.encrypt.repository.CryptRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class CryptService {
    final CryptRepository cryptRepository;

    public CryptService(CryptRepository cryptRepository) {
        this.cryptRepository = cryptRepository;
    }
    @Transactional
    public CryptModel save(CryptModel cryptModel) {
        return cryptRepository.save(cryptModel);
    }
    public Optional <CryptModel> findById (Long id) {
        return cryptRepository.findById(id);

    }
}
