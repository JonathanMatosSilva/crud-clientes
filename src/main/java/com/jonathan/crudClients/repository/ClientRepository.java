package com.jonathan.crudClients.repository;

import com.jonathan.crudClients.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
