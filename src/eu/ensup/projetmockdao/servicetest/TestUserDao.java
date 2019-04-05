package eu.ensup.projetmockdao.servicetest;

import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import eu.ensup.projetmockdao.dao.PersonDao;
import eu.ensup.projetmockdao.domaine.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;
import eu.ensup.projetmockdao.domaine.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class TestUserDao {
    @Mock
    private DataSource ds;
    @Mock
    private Connection c;
    @Mock
    private PreparedStatement stmt;
    @Mock
    private ResultSet rs;
    private Person p1;
    
    
    
 // mocker la classe
    // définir le pattern comportemental
    // faire une assertion 
    
    
    
    // SC1 : La création d'une personne per le système renvoie "vrai" si la création est un succés ou "faux" si 
    // la création échoue.
    
    @Test
    public void nullCreateThrowsException() {
    	PersonDao dao = mock(PersonDao.class);
    	when(dao.create(null)).thenReturn(false);
        assertFalse("OK", dao.create(null));
        
    }
    
    @Test
    public void createPerson() {
    	PersonDao dao = mock(PersonDao.class);
    	when(dao.create(p1)).thenReturn(true);
    	assertTrue("OK", dao.create(p1));
    	
    	// SC2 : A- La lecture d'une personne par le système grâce à son idenifiant renvoie l'ensemble des informations 
    	// si celle-ci existe
    	// 		B- La lecture d'une personne par le système grâce à son idenifiant renvoie null si celle-ci n'existe pas
        
    }
    
    @Test
    public void createAndRetrievePerson() throws Exception {
    	PersonDao dao = mock(PersonDao.class);
        when(dao.retrieve(2)).thenReturn(p1);
        assertEquals(dao.retrieve(2), p1);
        
    }
}

