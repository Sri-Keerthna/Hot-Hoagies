package com.spiralforge.hothoagies.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderRequestDto implements Serializable{
	
	private String paymentMode;
	private String upiId;
}
