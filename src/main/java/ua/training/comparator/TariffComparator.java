package ua.training.comparator;

import ua.training.model.entity.Tariff;

import java.util.*;

public class TariffComparator implements Comparator<Tariff> {
    public int compare(Tariff o1, Tariff o2) {
        return o1.getMonthFee().compareTo(o2.getMonthFee());
    }
}
