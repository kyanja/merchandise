/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.acceleratorstorefrontcommons.forms;

/**
 * Form object for updating profile.
 */
public class UpdateProfileForm
{

	private String titleCode;
	private String firstName;
	private String lastName;
	private String emailNotificationbean;
	private String alternativeMail;
    private String mobilePhoneNumber;


	/**
	 * @return the titleCode
	 */
	public String getTitleCode()
	{
		return titleCode;
	}

	/**
	 * @param titleCode
	 *           the titleCode to set
	 */
	public void setTitleCode(final String titleCode)
	{
		this.titleCode = titleCode;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @param firstName
	 *           the firstName to set
	 */
	public void setFirstName(final String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}


	/**
	 * @param lastName
	 *           the lastName to set
	 */
	public void setLastName(final String lastName)
	{
		this.lastName = lastName;
	}

       public String getEmailNotificationbean() {
        return emailNotificationbean;
    }

    public void setEmailNotificationbean(String emailNotificationbean) {
        this.emailNotificationbean = emailNotificationbean;
    }
	
		 public String getAlternativeMail() {
        return alternativeMail;
    }

    public void setAlternativeMail(String alternativeMail) {
        this.alternativeMail = alternativeMail;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

}
