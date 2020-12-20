package com.hz.yuidesignpatterns;

import com.hz.yuidesignpatterns.flyweight_pattern.Ticket;
import com.hz.yuidesignpatterns.flyweight_pattern.TicketFactory;
import com.hz.yuidesignpatterns.iterator_pattern.Boss;
import com.hz.yuidesignpatterns.iterator_pattern.Director;
import com.hz.yuidesignpatterns.iterator_pattern.GroupLeader;
import com.hz.yuidesignpatterns.iterator_pattern.Manager;

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
//    @Test
//    public void IteratorPattern(){
//        //构造各个领导对象
//        GroupLeader groupLeader = new GroupLeader();
//        Director director = new Director();
//        Manager manager = new Manager();
//        Boss boss = new Boss();
//
//        //设置上一级领导处理者对象
//        groupLeader.nextHandler = director;
//        director.nextHandler = manager;
//        manager.nextHandler = boss;
//
//        //发起报账申请
//        groupLeader.handleRequest(50000);
//    }
}