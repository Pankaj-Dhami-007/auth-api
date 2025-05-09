package com.neepanklok.sevices;

import com.neepanklok.entities.Client;
import com.neepanklok.repository.ClientRepo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class ClientService {
    @Autowired
    private ClientRepo clientRepo;
    private static final Logger logger = LoggerFactory.getLogger(ClientService.class);
    // create client
    public Client createClient(Client client){
        client.setCreatedAt(LocalDateTime.now());
        logger.info("Client");

      return  clientRepo.save(client);
    }
}
