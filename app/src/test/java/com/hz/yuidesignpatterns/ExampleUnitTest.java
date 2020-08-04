package com.hz.yuidesignpatterns;

import com.hz.yuidesignpatterns.flyweight_pattern.Ticket;
import com.hz.yuidesignpatterns.flyweight_pattern.TicketFactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Ticket ticket01 = TicketFactory.getTicket("北京","上海");
        ticket01.showTicketInfo("上铺");
        Ticket ticket02 = TicketFactory.getTicket("北京","上海");
        ticket02.showTicketInfo("中铺");
        Ticket ticket03 = TicketFactory.getTicket("北京","上海");
        ticket03.showTicketInfo("下铺");
    }
}