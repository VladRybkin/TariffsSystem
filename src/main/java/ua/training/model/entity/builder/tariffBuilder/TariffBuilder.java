package ua.training.model.entity.builder.tariffBuilder;

import ua.training.model.entity.Tariff;

public abstract class TariffBuilder {
     protected Tariff tariff;

    Tariff getTariff() {
        return tariff;
    }

    public void createNewTariff() {
        tariff = new Tariff();
    }

    public abstract void buildTariffType();

    public abstract void buildMonthFee();

    public abstract void buildCostMinute();

    public abstract void buildCostSMS();

    public abstract void buildAvailableMinutes();

    public abstract void buildAvailableSMS();
}

