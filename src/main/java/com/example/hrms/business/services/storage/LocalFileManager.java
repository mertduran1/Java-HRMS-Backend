package com.example.hrms.business.services.storage;

import com.example.hrms.entities.concretes.CandidateCV.StorageType;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class LocalFileManager implements FileService{

    @Override
    public StorageType getFileStorageName() {
        return StorageType.Local;
    }

    @Override
    public String uploadFile(MultipartFile file) throws IOException {
        File upFile = new File("src/main/" + file.getOriginalFilename());
        String path = upFile.getAbsolutePath();
        file.transferTo(Path.of(upFile.getAbsolutePath()));

        return path;
    }
}
