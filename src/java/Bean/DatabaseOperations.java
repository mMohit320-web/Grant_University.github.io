/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author THis PC
 */
public  class DatabaseOperations {
    Session session;
   private Transaction tr;
    public  void addData(RegistrationForm form){
        try{
         session=HibernateUtil.getSessionFactory().openSession();
       tr= session.beginTransaction();
        session.save(form);
        tr.commit();
        }
        catch(HibernateException e){
            System.out.println(e);
        }
        finally{
            session.flush();
            session.close();
        }
    }
}
