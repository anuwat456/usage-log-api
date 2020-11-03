package com.min.usegelogapi.model.tables;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@ToString
@Data
@Entity(name = "qr_code")
public class QRCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "qr_code")
    private String qrCode;
    @Column(name = "generate_qr_code")
    private Instant generateQRCode = Instant.now();

//    @OneToMany(targetEntity = ScanQRCode.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "qr_code_Id", referencedColumnName = "id")
//    private List<ScanQRCode> scanQRCodes;
}
