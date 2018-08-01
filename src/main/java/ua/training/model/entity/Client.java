package ua.training.model.entity;

public class Client {
    private TariffType tariffType;
    private String name;
    private String phoneNumber;

    public Client(TariffType tariffType, String name, String phoneNumber) {
        this.tariffType = tariffType;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Client() {
    }

    public TariffType getTariffType() {
        return tariffType;
    }

    public void setTariffType(TariffType tariffType) {
        this.tariffType = tariffType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "tariffType=" + tariffType +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
