package de.hybris.merchandise.facades.customer.impl;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.user.CustomerModel;
import org.springframework.util.Assert;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

public class MerchandiseDefaultCustomerFacade  extends DefaultCustomerFacade {

    @Override
    public void register(final RegisterData registerData) throws DuplicateUidException
    {
        validateParameterNotNullStandardMessage("registerData", registerData);
        Assert.hasText(registerData.getFirstName(), "The field [FirstName] cannot be empty");
        Assert.hasText(registerData.getLastName(), "The field [LastName] cannot be empty");
        Assert.hasText(registerData.getLogin(), "The field [Login] cannot be empty");

        final CustomerModel newCustomer = getModelService().create(CustomerModel.class);

        newCustomer.setAlternativEmail(registerData.getAlternativEmail());
        newCustomer.setMobilePhoneNumber(registerData.getMobilePhoneNumber());
        setCommonPropertiesForRegister(registerData, newCustomer);
        getCustomerAccountService().register(newCustomer, registerData.getPassword());
    }


    @Override
    public void updateProfile(final CustomerData customerData) throws DuplicateUidException
    {
        validateDataBeforeUpdate(customerData);

        final String name = getCustomerNameStrategy().getName(customerData.getFirstName(), customerData.getLastName());
        final CustomerModel customer = getCurrentSessionCustomer();
        customer.setEmailPreference(Boolean.valueOf(customerData.getEmailNotification()));
        customer.setAlternativEmail(customerData.getAlternativEmail());
        customer.setMobilePhoneNumber(customerData.getMobilePhoneNumber());
        customer.setOriginalUid(customerData.getDisplayUid());
        getCustomerAccountService().updateProfile(customer, customerData.getTitleCode(), name, customerData.getUid());
    }
}
