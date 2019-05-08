package com.cg.demo.util;

import javax.persistence.*;


public class JPAutil {
public static EntityManager getEntitymanager() {
	EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = fact.createEntityManager();
	return em;
}
}
