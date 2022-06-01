package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Inquiry;

public interface InquiryDao {

	void insertInquiry(Inquiry inquiry);

//  This is used in the latter chapter
	int updateInquiry(Inquiry inquiry);

	List<Inquiry> getAll();
}