package ua.training.utils;

import ua.training.model.entity.Client;
import ua.training.model.entity.InternetTariff;
import ua.training.model.entity.Tariff;
import ua.training.model.entity.TariffType;
import ua.training.model.entity.builder.tariffBuilder.*;

import java.util.ArrayList;
import java.util.List;


public class TariffUtil {


    public static Tariff searchTariff(List<Tariff> tariffs, double monthFee) {
        Tariff tariff = null;
        for (Tariff e : tariffs) {
            if (e.getMonthFee().equals(monthFee)) {
                tariff = e;
            }
        }


        return tariff;
    }

    public static List searchTariffWithinDiapasone(List<Tariff> tariffs, double from, double to) {
        List<Tariff> foundTariffs = new ArrayList<>();
        for (Tariff e : tariffs) {
            if (e.getMonthFee() <= to && e.getMonthFee() >= from) {
                foundTariffs.add(e);

            }
        }


        return foundTariffs;
    }

    public static int clientAmount(List<Client> list) {
        return list.size();
    }

    public static Tariff getStandardTariff() {
        BuilderManager builderManager = new BuilderManager();
        TariffBuilder standard = new StandardTariffBuilder();
        builderManager.setTariffBuilder(standard);
        builderManager.constructTariff();
        Tariff tariff = builderManager.getTariff();
        return tariff;
    }

    public static Tariff getPremiumTariff() {
        BuilderManager builderManager = new BuilderManager();
        TariffBuilder premium = new PremiumTariffBuilder();
        builderManager.setTariffBuilder(premium);
        builderManager.constructTariff();
        Tariff tariff = builderManager.getTariff();
        return tariff;
    }

    public static Tariff getInternetStandardTariff() {
        Tariff internetStandardTariff = new InternetTariff(TariffType.INTERNET_STANDARD, 150.00, 0.50, 0.30, 200, 30, 3);
        BuilderManager builderManager = new BuilderManager();
        InternetTariffBuilder internetStandard = new InternetStandardTariffBuilder();
        builderManager.setTariffBuilder(internetStandard);
        builderManager.constructTariff();
        Tariff tariff = builderManager.getTariff();
        return internetStandardTariff;
    }

    public static Tariff getInternetPremiumTariff() {
        Tariff internetPremiumTariff = new InternetTariff(TariffType.INTERNET_PREMIUM, 250.00, 0.50, 0.30, 200, 30, 5);
        BuilderManager builderManager = new BuilderManager();
        InternetPremiumTariffBuilder internetPremium = new InternetPremiumTariffBuilder();
        builderManager.setTariffBuilder(internetPremium);
        builderManager.constructTariff();
        Tariff tariff = builderManager.getTariff();
        return internetPremiumTariff;
    }


}
