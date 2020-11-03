package com.min.usegelogapi.model.services;

import com.min.usegelogapi.model.tables.ScanQRCode;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ScanQRCodeRepository extends JpaRepository<ScanQRCode, Integer> {
    List<ScanQRCode> findByUserId(int userId);

//    Page<ScanQRCode> findByQrCode(Integer qrCodeId, Pageable pageable);
//    Optional<ScanQRCode> findByIdAndQrCodeID(Integer id, Integer qrCodeId);
}
