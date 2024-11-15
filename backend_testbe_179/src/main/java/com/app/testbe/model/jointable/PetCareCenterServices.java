package com.app.testbe.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.testbe.model.Manager;
import com.app.testbe.model.Pet;
import com.app.testbe.model.PetCareCenter;
import com.app.testbe.model.PetOwner;
import com.app.testbe.model.Document;
import com.app.testbe.model.PetService;
import com.app.testbe.enums.PetServiceType;
import com.app.testbe.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterServices")
@Table(schema = "\"testbe\"", name = "\"PetCareCenterServices\"")
@Data
public class PetCareCenterServices{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"ServiceId\"")
    private Integer serviceId;
 
}