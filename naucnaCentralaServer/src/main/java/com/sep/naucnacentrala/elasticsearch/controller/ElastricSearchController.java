package com.sep.naucnacentrala.elasticsearch.controller;

import com.sep.naucnacentrala.elasticsearch.NaucniRadESDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ElastricSearchController {


    @RequestMapping(
            value    = "/elasticsearch/uploadPdf/{formData}",
            method   = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> uloadPdf(@RequestBody MultipartFile formData) {

        NaucniRadESDTO naucniRad =
        return new ResponseEntity<>("Successful", HttpStatus.OK);
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<EBook> uploadEBook(@RequestParam("file") MultipartFile file) {

        }        EBook eBook = eBookService.uploadEBook(file);
        return new ResponseEntity<EBook>(eBook, HttpStatus.OK);
    }

}
