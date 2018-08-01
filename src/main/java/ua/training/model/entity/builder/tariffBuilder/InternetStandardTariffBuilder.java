package ua.training.model.entity.builder.tariffBuilder;

import ua.training.model.entity.TariffType;

public class InternetStandardTariffBuilder extends InternetTariffBuilder {
    @Override
    public void buildTariffType() {
        tariff.setTariffType(TariffType.INTERNET_STANDARD);
    }

    @Override
    public void buildMonthFee() {
        tariff.setMonthFee(150.00);
    }

    @Override
    public void buildCostMinute() {
        tariff.setCostMinute(0.50);
    }

    @Override
    public void buildCostSMS() {
        tariff.setCostSMS(0.30);
    }

    @Override
    public void buildAvailableMinutes() {
        tariff.setAvailableSMS(30);
    }

    @Override
    public void buildAvailableSMS() {
        tariff.setAvailableMinutes(100);
    }

    @Override
    public void buildAvailableInternetGB() {
        tariff.setAvailableInternetGB(3);
    }
}
