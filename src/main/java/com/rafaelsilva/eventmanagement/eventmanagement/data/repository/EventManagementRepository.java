package com.rafaelsilva.eventmanagement.eventmanagement.data.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rafaelsilva.eventmanagement.eventmanagement.data.entity.EventManagementDTO;

@Repository
public class EventManagementRepository {

	/**
	 * We are using the application.propertier spring file here
	 */
	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * 
	 * @return
	 */
	public List<EventManagementDTO> getAllEventManagement() {
		String sql = "select * from custom.ct_EventManagement";
		BeanPropertyRowMapper<EventManagementDTO> EventManagementDTORowMapper = BeanPropertyRowMapper
				.newInstance(EventManagementDTO.class);
		List<EventManagementDTO> eventManagement = jdbcTemplate.query(sql, EventManagementDTORowMapper);
		return eventManagement;
	}
}
