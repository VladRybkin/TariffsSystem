package ua.training.model.entity.builder.tariffBuilder;

import ua.training.model.entity.InternetTariff;
import ua.training.model.entity.TariffType;

public class InternetPremiumTariffBuilder extends InternetTariffBuilder {
    @Override
    public void buildTariffType() {
        tariff.setTariffType(TariffType.INTERNET_PREMIUM);
    }

    @Override
    public void buildMonthFee() {
        tariff.setMonthFee(250.00);
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

    @Override
    public void buildAvailableInternetGB() {
        tariff.setAvailableInternetGB(5);
    }

    @Override
    InternetTariff getTariff() {
        return super.getTariff();
    }


}
