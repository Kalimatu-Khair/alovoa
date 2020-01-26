package com.nonononoki.alovoa.model;

import java.util.Date;

import com.nonononoki.alovoa.entity.User;

import lombok.Value;

@Value
public class RegisterDto {
	
	private String email;
	private String password;
	private String firstName;
	private Date dateOfBirth;
	private long gender;
	private long intention;
	
	private String captchaText;
	private long captchaId;	
	
	private boolean termsConditions;
	private boolean privacy;
}