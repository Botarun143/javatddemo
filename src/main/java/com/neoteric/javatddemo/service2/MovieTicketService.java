package com.neoteric.javatddemo.service2;

import com.neoteric.javatddemo.model2.MainTicket;
import com.neoteric.javatddemo.model2.MyTicket;

import java.util.UUID;

public class MovieTicketService {
    public MainTicket getTicket(MyTicket myTicket){

        MainTicket mainTicket = null;
        if(myTicket.movieName.equals("Kalki") && myTicket.seatNo.equals("B6") && myTicket.Date.equals("20-07-2024")){
            mainTicket = new MainTicket();
            mainTicket.movieName = myTicket.movieName;
            mainTicket.transactionId=UUID.randomUUID();
            mainTicket.seatNo="B6";
            mainTicket.showTime="2:30";
            mainTicket.date="20-07-2024";



        }
        return mainTicket;

    }
}
