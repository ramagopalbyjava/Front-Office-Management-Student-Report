package com.ashoikIt.frontOffice.service;

import java.util.List;

import com.ashoikIt.frontOffice.bindings.DashboardResponse;
import com.ashoikIt.frontOffice.bindings.EnquiryForm;
import com.ashoikIt.frontOffice.bindings.EnquirySearchCriteria;

public interface EnquiryService {

	public List<String> getCourseNames();

	public List<String> getEnquiryStatus();

	public String upsertEnquiry(EnquiryForm form);

	public DashboardResponse getDashBoardData(Integer userId);

	public List<EnquiryForm> getEnquires(Integer userId, EnquirySearchCriteria criteria);

	public EnquiryForm getEnquiry(Integer enqId);
}
