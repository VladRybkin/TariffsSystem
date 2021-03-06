package ua.training.model.entity.builder.tariffBuilder;

import ua.training.model.entity.TariffType;

public class PremiumTariffBuilder extends TariffBuilder {
    @Override
    public void buildTariffType() {
        tariff.setTariffType(TariffType.PREMIUM);
    }

    @Override
    public void buildMonthFee() {
        tariff.setMonthFee(200.00);
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
        tariff.setAvailableSMS(100);
    }

    @Override
    public void buildAvailableSMS() {
        tariff.setAvailableMinutes(300);
    }
}
