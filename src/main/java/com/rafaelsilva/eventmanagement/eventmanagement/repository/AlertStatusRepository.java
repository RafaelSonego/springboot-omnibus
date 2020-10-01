package com.rafaelsilva.eventmanagement.eventmanagement.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AlertStatusRepository {

	/**
	 * We are using the application.propertier spring file here
	 */
	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * Return only the Alert Identifier list
	 * 
	 * @return
	 */
	public List<String> getAllAlertIdentifier() {
		List<String> alertIdentifierList = new ArrayList<String>();
		alertIdentifierList.addAll(jdbcTemplate.queryForList("select Identifier from alerts.status", String.class));
		return alertIdentifierList;
	}

}
