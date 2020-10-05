package com.rafaelsilva.eventmanagement.eventmanagement.controller;
//make this as rest controller for AlertStatus

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelsilva.eventmanagement.eventmanagement.data.entity.EventManagementDTO;
import com.rafaelsilva.eventmanagement.eventmanagement.data.repository.EventManagementRepository;

@RestController
@RequestMapping(path = "eventManagement")
public class EventManagementController {
	@Autowired
	EventManagementRepository eventManagementRepository;

	@GetMapping(path = "/getAllEventManagement", headers = "Accept=application/json", produces = "text/plain;charset=UTF-8")
	public List<EventManagementDTO> getAllEventManagement() {
		return eventManagementRepository.getAllEventManagement();
	}
}
