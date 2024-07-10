package com.neoteric.javatddemo.service2;

import com.neoteric.javatddemo.model2.MainTicket;
import com.neoteric.javatddemo.model2.MyTicket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTicketServiceTest {

    @Test


        public void test() {
            MyTicket myTicket = new MyTicket();
            myTicket.movieName="Kalki";
            myTicket.seatNo="B6";
            myTicket.showTime="2:30";
            myTicket.Date="20-07-2024";
            MovieTicketService movieTicketService = new MovieTicketService();
            MainTicket mainTicket =movieTicketService.getTicket(myTicket);
            Assertions.assertNotNull(mainTicket.seatNo);
            Assertions.assertEquals(mainTicket.seatNo,myTicket.seatNo);

        }

}