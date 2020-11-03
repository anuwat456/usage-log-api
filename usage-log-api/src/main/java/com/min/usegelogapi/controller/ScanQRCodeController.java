package com.min.usegelogapi.controller;

import com.min.usegelogapi.model.bean.APIResponse;
import com.min.usegelogapi.model.services.QRCodeRepository;
import com.min.usegelogapi.model.services.ScanQRCodeRepository;
import com.min.usegelogapi.model.tables.QRCode;
import com.min.usegelogapi.model.tables.ScanQRCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/scanqrcode")
public class ScanQRCodeController {
    @Autowired
    private ScanQRCodeRepository scanQRCodeRepository;

    @PostMapping("/userscan")
    public Object userScan(ScanQRCode scanQRCode) {
        APIResponse res = new APIResponse();
        ScanQRCode dbQRCode = scanQRCodeRepository.save(scanQRCode);
        res.setMessage("User scanner success.");
        res.setData(dbQRCode);
        System.out.println(dbQRCode);
        return res;
    }

    @PostMapping("/findalluserqrcode")
    public Object findAllUserQRCode() {
        APIResponse res = new APIResponse();
        List<ScanQRCode> dbscanQRCode = scanQRCodeRepository.findAll();
        res.setData(dbscanQRCode);
        return res;
    }

    @PostMapping("/findbyuserqrcode")
    public Object findByUserQRCode(@RequestParam Integer userId) {
        APIResponse res = new APIResponse();
        List<ScanQRCode> dbScanQRCode = scanQRCodeRepository.findByUserId(userId);
        res.setData(dbScanQRCode);
        return res;
    }
}
