package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DELIVERY_CODE_TYPE_T", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "DELIVERY_CODE_TYPE_ID"))
@EqualsAndHashCode(callSuper = false)
@Data
public class DeliveryCodeTypeEntity extends AbstractEntity<Integer>{

    @Column(name = "DELIVERY_CODE_TYPE")
    private String deliveryCodeType;

    @Column(name = "DESCRIPTION")
    private String description;

}
