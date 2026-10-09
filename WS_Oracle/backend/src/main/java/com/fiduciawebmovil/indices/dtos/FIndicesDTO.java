package com.fiduciawebmovil.indices.dtos;




import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.indices.entity.FIndicesId;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FIndicesDTO {
@EmbeddedId
    private FIndicesId id;

    @Column
    private String eindDescripcion;

    @Column(length = 150)
    private String eindFormaEmp;

    @Column(length = 50)
    private String eindParam1;

    @Column(length = 50)
    private String eindDesParam1;

    @Column(length = 50)
    private String eindParam2;

    @Column(length = 50)
    private String eindDesParam2;

    @Column(length = 25)
    private String eindStIndices;
}
