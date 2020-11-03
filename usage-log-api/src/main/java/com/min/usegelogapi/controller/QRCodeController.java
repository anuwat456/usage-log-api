package com.min.usegelogapi.controller;

import com.min.usegelogapi.model.bean.APIResponse;
import com.min.usegelogapi.model.services.QRCodeRepository;
import com.min.usegelogapi.model.tables.QRCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/qrcode")
public class QRCodeController {
    @Autowired
    private QRCodeRepository generateQRCodeRepository;

    @PostMapping("/createQRCode")
    public Object createQRCode(QRCode qrCode) {
        APIResponse res = new APIResponse();
        QRCode dbGenerateQRCode = generateQRCodeRepository.save(qrCode);
        System.out.println(dbGenerateQRCode);
        res.setMessage("Create QrCode");
        res.setData(dbGenerateQRCode);
        return res;
    }

    @PostMapping("/findallqrcodes")
    public Object findAllQRCodes() {
        APIResponse res = new APIResponse();
        List<QRCode> dbGenerateQRCode = generateQRCodeRepository.findAll();
        res.setData(dbGenerateQRCode);
        return res;
    }
}
