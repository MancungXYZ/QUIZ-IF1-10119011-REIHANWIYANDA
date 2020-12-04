/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119011.reihanwiyanda;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class QUIZIF110119011REIHANWIYANDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ServicePrice sp = new ServicePrice ();
        Customer plgn = new Customer ();
        
        System.out.println("===Program Kasir Rock n Roll Haircut===");
        System.out.print("Customer Name : ");
        plgn.setNama(sc.nextLine());
        
        System.out.print("Customer Email : ");
        plgn.setEmail(sc.next());
        
        sp.displayService();
        sp.getPrice(sc.nextInt());
        
        System.out.print("Are you Member(Yes/No) :");
        plgn.setMember(sp.checkMemberStatus(sc.next()));
        
        System.out.println("#****************************#");
        System.out.println("#******Customer Invoice******#");
        System.out.println("Date Transaction : " + plgn.currentTime());
        System.out.println("Service Price : " + sp.getPriceService());
        System.out.println("Discount : " + sp.getSale(plgn.isMember(), sp.getPriceService()));
        System.out.println("Service Price : " + sp.getTotalPay(sp.getPriceService(), sp.getSale(plgn.isMember(), sp.getPriceService())));
    }
    
}
