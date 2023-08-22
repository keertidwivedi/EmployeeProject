package com.org.main.RequestDTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientRequestDto {


	private String clientName;

	private String clientCountry;

	private String remarks;

		public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientCountry() {
		return clientCountry;
	}

	public void setClientCountry(String clientCountry) {
		this.clientCountry = clientCountry;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	

}
