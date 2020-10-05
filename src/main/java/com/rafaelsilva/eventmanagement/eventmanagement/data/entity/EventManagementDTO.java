package com.rafaelsilva.eventmanagement.eventmanagement.data.entity;

public class EventManagementDTO {

	private String ConditionName;
	private String ConditionDescription;
	private boolean EnableAutoIncident;
	private boolean EnableChangeExpireTime;
	private boolean EnableCIEnrichment;
	private boolean EnableEscalation;
	private boolean EnableRunDeck;
	private int ExpireTime;
	private String FilterStat;
	private int RDmaxDuration;
	private int RDmaxTally;

	public EventManagementDTO() {
	}
	
	public EventManagementDTO(String ConditionName) {
		this.setConditionName(ConditionName);
	}
	
	public String getConditionDescription() {
		return ConditionDescription.trim();
	}

	public void setConditionDescription(String conditionDescription) {
		ConditionDescription = conditionDescription;
	}

	public boolean isEnableAutoIncident() {
		return EnableAutoIncident;
	}

	public void setEnableAutoIncident(boolean enableAutoIncident) {
		EnableAutoIncident = enableAutoIncident;
	}

	public boolean isEnableChangeExpireTime() {
		return EnableChangeExpireTime;
	}

	public void setEnableChangeExpireTime(boolean enableChangeExpireTime) {
		EnableChangeExpireTime = enableChangeExpireTime;
	}

	public boolean isEnableCIEnrichment() {
		return EnableCIEnrichment;
	}

	public void setEnableCIEnrichment(boolean enableCIEnrichment) {
		EnableCIEnrichment = enableCIEnrichment;
	}

	public boolean isEnableEscalation() {
		return EnableEscalation;
	}

	public void setEnableEscalation(boolean enableEscalation) {
		EnableEscalation = enableEscalation;
	}

	public boolean isEnableRunDeck() {
		return EnableRunDeck;
	}

	public void setEnableRunDeck(boolean enableRunDeck) {
		EnableRunDeck = enableRunDeck;
	}

	public int getExpireTime() {
		return ExpireTime;
	}

	public void setExpireTime(int expireTime) {
		ExpireTime = expireTime;
	}

	public String getFilterStat() {
		return FilterStat.trim();
	}

	public void setFilterStat(String filterStat) {
		FilterStat = filterStat;
	}

	public int getRDmaxDuration() {
		return RDmaxDuration;
	}

	public void setRDmaxDuration(int rDmaxDuration) {
		RDmaxDuration = rDmaxDuration;
	}

	public int getRDmaxTally() {
		return RDmaxTally;
	}

	public void setRDmaxTally(int rDmaxTally) {
		RDmaxTally = rDmaxTally;
	}

	public String getConditionName() {
		return ConditionName.trim();
	}

	public void setConditionName(String conditionName) {
		ConditionName = conditionName;
	}

	@Override
	public String toString() {
		return "EventManagementDTO [ConditionName=" + ConditionName + ", ConditionDescription=" + ConditionDescription
				+ ", EnableAutoIncident=" + EnableAutoIncident + ", EnableChangeExpireTime=" + EnableChangeExpireTime
				+ ", EnableCIEnrichment=" + EnableCIEnrichment + ", EnableEscalation=" + EnableEscalation
				+ ", EnableRunDeck=" + EnableRunDeck + ", ExpireTime=" + ExpireTime + ", FilterStat=" + FilterStat
				+ ", RDmaxDuration=" + RDmaxDuration + ", RDmaxTally=" + RDmaxTally + "]";
	}

}
