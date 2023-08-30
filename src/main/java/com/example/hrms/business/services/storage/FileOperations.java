package com.example.hrms.business.services.storage;

import org.springframework.web.multipart.MultipartFile;

public class FileOperations {
    //Get filename with an extension
    //method can be called without creating an instance of the class, which can save memory which is why we use static.
    public static String getFileNameWithExtension(MultipartFile file) {
        String fileNameWithAnExtension = file.getOriginalFilename();
        return fileNameWithAnExtension;
    }

    //get filename without an extension
    public static String getFileNameWithoutExtension(MultipartFile multipartFile) {
        int fileIndex = getFileNameWithExtension(multipartFile).lastIndexOf('.');
        String fileName = getFileNameWithExtension(multipartFile).substring(0, fileIndex);
        return fileName;
    }
}
