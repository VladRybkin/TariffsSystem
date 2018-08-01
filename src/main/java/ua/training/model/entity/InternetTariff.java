package ua.training.model.entity;

public class InternetTariff extends Tariff {

    private int availableInternetGB;

    public InternetTariff() {
    }

    public InternetTariff(TariffType tariffType, Double monthFee, double costMinute, double costSMS, int availableMinutes, int availableSMS, int availableInternetGB) {
        super(tariffType, monthFee, costMinute, costSMS, availableMinutes, availableSMS);
        this.availableInternetGB = availableInternetGB;

    }

    public int getAvailableInternetGB() {
        return availableInternetGB;
    }

    public void setAvailableInternetGB(int availableInternetGB) {
        this.availableInternetGB = availableInternetGB;
    }

    @Override
    public String toString() {
        return super.toString()+ "InternetTariff{" +
                "availableInternetGB=" + availableInternetGB +
                '}';
    }
}
