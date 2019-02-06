package com.sep.naucnacentrala.elasticsearch.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import com.sep.naucnacentrala.elasticsearch.KorisnikESDTO;
import com.sep.naucnacentrala.elasticsearch.NaucniRadESDTO;
import org.springframework.web.multipart.MultipartFile;

public class ElasticSearchServiceImpl implements ElasticSearchService {

	@Override
	public List<NaucniRadESDTO> searchByOneField(String field, String value) {
		
		
		
		return null;
	}

	@Override
	public List<NaucniRadESDTO> searchByMoreFields(Map<String, String> json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NaucniRadESDTO> searchByMultipleOptionalFields(Map<String, Object> json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NaucniRadESDTO> searchByMoreLikeThis(String similarText) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NaucniRadESDTO> searchByGeoPoint(Long longitude, Long latitude) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NaucniRadESDTO uploadEBook(MultipartFile file) {

		NaucniRadESDTO naucniRad = new NaucniRadESDTO();

		naucniRad.setNaslovRada(file.getOriginalFilename());
		// eBook = eBookRepository.save(eBook);
		// Long id = eBook.getId();
		naucniRad = indexingService.addEBook(eBook, file);

		String baseDirectory = "D:/home";
		try {
			Files.createDirectories(Paths.get(baseDirectory, "books"));
			Files.write(Paths.get(baseDirectory, "books", file.getOriginalFilename()), file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		eBook.setFilename(file.getOriginalFilename());
		return eBook;
	}

}
