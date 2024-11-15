package com.app.testbe.function;

import com.app.testbe.model.Manager;
import com.app.testbe.model.Pet;
import com.app.testbe.model.PetCareCenter;
import com.app.testbe.model.PetOwner;
import com.app.testbe.model.Document;
import com.app.testbe.model.PetService;




import com.app.testbe.enums.PetServiceType;
import com.app.testbe.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  