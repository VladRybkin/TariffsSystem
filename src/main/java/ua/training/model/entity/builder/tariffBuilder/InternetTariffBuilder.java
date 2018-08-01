package ua.training.model.entity.builder.tariffBuilder;

import ua.training.model.entity.InternetTariff;

public abstract class InternetTariffBuilder extends TariffBuilder {
    InternetTariff tariff;

    InternetTariff getTariff() {
        return tariff;
    }

    public void createNewTariff() {
        tariff = new InternetTariff();
    }

    public abstract void buildAvailableInternetGB();
}
