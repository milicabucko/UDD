package com.sep.naucnacentrala.elasticsearch.service;

import java.util.List;
import java.util.Map;

import com.sep.naucnacentrala.elasticsearch.NaucniRadESDTO;
import org.springframework.web.multipart.MultipartFile;

public interface ElasticSearchService {

	List<NaucniRadESDTO> searchByOneField(String field, String value);
	List<NaucniRadESDTO> searchByMoreFields(Map<String, String> json);
	List<NaucniRadESDTO> searchByMultipleOptionalFields(Map<String, Object> json);
	List<NaucniRadESDTO> searchByMoreLikeThis(String similarText);
	List<NaucniRadESDTO> searchByGeoPoint(Long longitude, Long latitude);

	NaucniRadESDTO uploadEBook(MultipartFile file);
}
