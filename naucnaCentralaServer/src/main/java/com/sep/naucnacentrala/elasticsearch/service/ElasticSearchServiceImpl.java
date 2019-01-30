package com.sep.naucnacentrala.elasticsearch.service;

import java.util.List;
import java.util.Map;

import com.sep.naucnacentrala.elasticsearch.NaucniRadESDTO;

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

}
