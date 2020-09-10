package de.hybris.merchandise.facades.populators;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class MerchandiseCustomerPopulator  implements Populator<CustomerModel, CustomerData> {
    @Override
    public void populate(final CustomerModel source, final CustomerData target) throws ConversionException {

        if (source.getEmailPreference()== null ? false : source.getEmailPreference().booleanValue()){

            target.setEmailPreferenceBean("true");
        }

        else

        {

            target.setEmailPreferenceBean("false");
        }

        target.setAlternativeMailBean(source.getAlternativeMail());
        target.setMobilePhoneNumberBean(source.getMobilePhoneNumber());
        target.setDateOfBirthBean(source.getDateOfBirth());
        target.setCustomerSiteAgeBean(String.valueOf(source.getCustomerSiteAge()));
    }

}

