package com.project.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {
    int counter=100;
    String pnr;
    String travelDate;
    Train train;
    Passenger passenger;
    public Ticket()
    {

    }

    public Ticket(int counter, String pnr, String travelDate, com.project.model.Train train, Passenger passenger) {
        this.counter = counter;
        this.pnr = pnr;
        this.travelDate = travelDate;
        this.train = train;
        this.passenger = passenger;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr() {
        Ticket t1=new Ticket();
        String pr=t1.generatePNR();
        this.pnr = pr;

    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public String generatePNR()
    {
        Train train=new Train();
        char s=train.getSource().charAt(0);
        char d=train.getDestination().charAt(0);
        SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyyy");
        Date date=new Date();
        String dt=sdf.format(date);
        String s1 = s + d + "_" + dt + "_" + counter;
        counter++;
        return s1;

    }
}
