package com.min.usegelogapi.model.services;

import com.min.usegelogapi.model.tables.QRCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QRCodeRepository extends JpaRepository<QRCode, Integer> {
    Optional<QRCode> findByQrCode(String qrCode);
}
