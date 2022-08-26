package com.jhonas.encrypt.repository;

import com.jhonas.encrypt.model.CryptModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CryptRepository extends JpaRepository<CryptModel, Long> {

}
