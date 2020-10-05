package com.rafaelsilva.eventmanagement.eventmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelsilva.eventmanagement.eventmanagement.data.repository.AlertStatusRepository;

//make this as rest controller for AlertStatus

@RestController
@RequestMapping(path = "alertStatus")
public class AlertStatusController {

	@Autowired
	AlertStatusRepository alertRepository;

	/**
	 * This method return all Identifier field List
	 * 
	 * @return alertIdentifierList
	 */
	@GetMapping(path = "/getAlertIdentifier")
	public List<String> getAllAlertsIdentifier() {
		return alertRepository.getAllAlertIdentifier();
	}

}
