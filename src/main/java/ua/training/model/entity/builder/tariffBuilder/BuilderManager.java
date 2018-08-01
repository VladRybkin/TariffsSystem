package ua.training.model.entity.builder.tariffBuilder;

import ua.training.model.entity.InternetTariff;
import ua.training.model.entity.Tariff;

public class BuilderManager {
//    private TariffBuilder standardTariffBuilder=new StandardTariffBuilder();
//    private TariffBuilder premiumTariffBuilder=new PremiumTariffBuilder();
//    private InternetTariffBuilder internetStandardTariffBuilder=new InternetStandardTariffBuilder();
//    private InternetTariffBuilder internetPremiumTariffBuilder=new InternetPremiumTariffBuilder();

    private TariffBuilder tariffBuilder;
    private InternetTariffBuilder internetTariffBuilder;


    public Tariff getTariff() {
        return tariffBuilder.getTariff();
    }

    public InternetTariff getInternetTariff() {
        return internetTariffBuilder.getTariff();
    }

    public void setTariffBuilder(TariffBuilder tariffBuilder) {
        this.tariffBuilder = tariffBuilder;
    }

    public void setInternetTariffBuilder(InternetTariffBuilder internetTariffBuilder) {
        this.internetTariffBuilder = internetTariffBuilder;
    }

    public void constructTariff() {
        tariffBuilder.createNewTariff();
        tariffBuilder.buildTariffType();
        tariffBuilder.buildMonthFee();
        tariffBuilder.buildCostMinute();
        tariffBuilder.buildCostSMS();
        tariffBuilder.buildAvailableMinutes();
        tariffBuilder.buildAvailableSMS();

    }

    public void constructInternetTariff() {
        internetTariffBuilder.createNewTariff();
        internetTariffBuilder.buildTariffType();
        internetTariffBuilder.buildMonthFee();
        internetTariffBuilder.buildCostMinute();
        internetTariffBuilder.buildCostSMS();
        internetTariffBuilder.buildAvailableMinutes();
        internetTariffBuilder.buildAvailableSMS();
        internetTariffBuilder.buildAvailableInternetGB();
    }

}
