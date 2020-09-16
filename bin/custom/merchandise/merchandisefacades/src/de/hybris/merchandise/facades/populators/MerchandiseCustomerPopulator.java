package de.hybris.merchandise.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;

public class MerchandiseCustomerPopulator extends CustomerPopulator {

    @Override
    public void populate(final CustomerModel source, final CustomerData target) {


        super.populate(source, target);

        if (source.getEmailPreference() == null || source.getEmailPreference()) {

            target.setEmailNotification("true");
        } else {

            target.setEmailNotification("false");
        }


            target.setAlternativEmail(source.getAlternativEmail());


            target.setMobilePhoneNumber(source.getMobilePhoneNumber());


        }

    }

