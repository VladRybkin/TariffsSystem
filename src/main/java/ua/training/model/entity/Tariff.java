package ua.training.model.entity;

import java.math.BigDecimal;

public class Tariff {
   private TariffType tariffType;
   private Double monthFee;
   private double costMinute;
   private double costSMS;
   private int availableMinutes;
   private int availableSMS;

   public Tariff() {
   }

   public Tariff(TariffType tariffType, Double monthFee, double costMinute, double costSMS, int availableMinutes, int availableSMS) {
      this.tariffType = tariffType;
      this.monthFee = monthFee;
      this.costMinute = costMinute;
      this.costSMS = costSMS;
      this.availableMinutes = availableMinutes;
      this.availableSMS = availableSMS;
   }


    public TariffType getTariffType() {
      return tariffType;
   }

   public void setTariffType(TariffType tariffType) {
      this.tariffType = tariffType;
   }

   public Double getMonthFee() {
      return monthFee;
   }

   public void setMonthFee(Double monthFee) {
      this.monthFee = monthFee;
   }

   public double getCostMinute() {
      return costMinute;
   }

   public void setCostMinute(double costMinute) {
      this.costMinute = costMinute;
   }

   public double getCostSMS() {
      return costSMS;
   }

   public void setCostSMS(double costSMS) {
      this.costSMS = costSMS;
   }

   public int getAvailableMinutes() {
      return availableMinutes;
   }

   public void setAvailableMinutes(int availableMinutes) {
      this.availableMinutes = availableMinutes;
   }

   public int getAvailableSMS() {
      return availableSMS;
   }

   public void setAvailableSMS(int availableSMS) {
      this.availableSMS = availableSMS;
   }

   @Override
   public String toString() {
      return "Tariff{" +
              "tariffType=" + tariffType +
              ", monthFee=" + monthFee +
              ", costMinute=" + costMinute +
              ", costSMS=" + costSMS +
              ", availableMinutes=" + availableMinutes +
              ", availableSMS=" + availableSMS +
              '}';
   }
}
