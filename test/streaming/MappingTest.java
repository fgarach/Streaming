/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import streaming.service.DBService;

/**
 *
 * @author admin
 */
public class MappingTest {
    
    @Before
    public void Before(){
        DBService dServ = new DBService();
        dServ.supprimerTout();
        
    }
    
    @Test
    public void MappingTest(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();

    }
}
