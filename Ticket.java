package com.project.model;

import java.io.*;

public class Ticket {
    int counter;
    String pnr;
    String travelDate;
    Train train;
    Ticket ticket;
    Passenger passenger;

    public Ticket( String travelDate, com.project.model.Train train) {
        this.travelDate = travelDate;
        this.train = train;
    }

    public Ticket() {

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

    public void setPnr(String pnr) {
        this.pnr = pnr;
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
    public String generatePNR(){
        Ticket ticket=new Ticket(travelDate,train);
        char source=train.getSource().charAt(0);
        char destination=train.getDestination().charAt(0);
        /*StringBuilder sb=new StringBuilder();
        sb.append(ticket.getTravelDate().charAt(6));
        sb.append(ticket.getTravelDate().charAt(7));
        sb.append(ticket.getTravelDate().charAt(8));
        sb.append(ticket.getTravelDate().charAt(9));
        sb.append(ticket.getTravelDate().charAt(3));
        sb.append(ticket.getTravelDate().charAt(4));
        sb.append(ticket.getTravelDate().charAt(0));
        sb.append(ticket.getTravelDate().charAt(1));
        String dt=sb.toString();*/
        String[] dt=ticket.getTravelDate().split("-",3);
        String pnrString=source+""+destination+"_"+dt[2]+dt[1]+dt[0]+"_"+ updateCounter();
        return pnrString;
    }
    public static int updateCounter()
    {
     String counterFileName="counter.txt";
     int counter=99;
     File counterFile=new File(counterFileName);
     if(counterFile.isFile())
     {
         try (BufferedReader reader = new BufferedReader(new FileReader(counterFileName)))
         {
             counter=Integer.parseInt(reader.readLine());
         }
         catch(IOException e)
         {
             e.printStackTrace();
             return 0;
         }
     }
     try(FileWriter writer = new FileWriter(counterFileName))
     {
         writer.write(String.valueOf(++counter));
     } catch(IOException e){
         e.printStackTrace();
         return 0;
     }
     return counter;
    }

}
