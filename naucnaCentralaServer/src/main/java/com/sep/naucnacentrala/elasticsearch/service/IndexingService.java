package com.sep.naucnacentrala.elasticsearch.service;

import com.sep.naucnacentrala.elasticsearch.NaucniRadESDTO;
import com.sun.beans.decoder.DocumentHandler;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class IndexingService {


    public NaucniRadESDTO dodajNaucniRad(NaucniRadESDTO naucniRad, MultipartFile file) {

        DocumentHandler handler = getHandler("pdf");
        naucniRad = handler.getEBook(convert(file));

        IndexQuery indexQuery = new IndexQueryBuilder()
                .withObject(naucniRad)
                .withId(file.getOriginalFilename())
                .build();

        String filename = elasticSearchTemplate.index(indexQuery);
        if(filename.contains(file.getOriginalFilename())) {
            return naucniRad;
        }

        return null;
    }
}
