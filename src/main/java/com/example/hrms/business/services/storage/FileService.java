package com.example.hrms.business.services.storage;

import com.example.hrms.entities.concretes.CandidateCV.StorageType;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
    StorageType getFileStorageName();
    String uploadFile(MultipartFile file) throws IOException;
}
