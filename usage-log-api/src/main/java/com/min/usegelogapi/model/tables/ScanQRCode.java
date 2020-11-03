package com.min.usegelogapi.model.tables;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.*;
import java.time.Instant;

@ToString
@Data
@Entity(name = "scan_qr_code")
public class ScanQRCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "qr_code_id")
    private int qrCodeId;
    @Column(name = "user_scanner")
    private Instant userScanner = Instant.now();

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "qr_id")
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnore
//    private QRCode qrCode;

}
