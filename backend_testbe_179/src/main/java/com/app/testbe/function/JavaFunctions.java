package com.app.testbe.function;

import com.app.testbe.model.Manager;
import com.app.testbe.model.Pet;
import com.app.testbe.model.PetCareCenter;
import com.app.testbe.model.PetOwner;
import com.app.testbe.model.Document;
import com.app.testbe.model.PetService;
import com.app.testbe.enums.PetServiceType;
import com.app.testbe.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.testbe.repository.PetServiceRepository;
import com.app.testbe.repository.PetOwnerRepository;
import com.app.testbe.repository.PetCareCenterRepository;
import com.app.testbe.repository.ManagerRepository;
import com.app.testbe.repository.DocumentRepository;
import com.app.testbe.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
