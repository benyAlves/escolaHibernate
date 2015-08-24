/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.teste;

import hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import uem.poo.sistema.escola.modelo.Turma;

/**
 *
 * @author maluleque
 */
public class Teste {

    public static void main(String[] args) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        //Transaction t = sess.beginTransaction();
       
        //t.commit();
        t.commit();
        s.close();
    }
}
