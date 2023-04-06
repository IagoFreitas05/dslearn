package com.devsuperior.dslearnbds.resources;

import com.devsuperior.dslearnbds.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.services.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverResource {
    @Autowired
    private DeliverService deliverService;

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> saveRevision(@RequestBody DeliverRevisionDTO deliverRevisionDTO, @PathVariable Long id) {
        deliverService.saveRevision(id, deliverRevisionDTO);
        return ResponseEntity.noContent().build();
    }
}