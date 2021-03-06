package co.com.sofka.challengeDDD.domain.show.entities;

import co.com.sofka.challengeDDD.domain.show.ids.CanalDeTransmisionId;
import co.com.sofka.challengeDDD.domain.show.valueobjects.AcuerdoDePago;
import co.com.sofka.challengeDDD.domain.show.valueobjects.PaginasDeTransmision;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class CanalDeTransmision extends Entity<CanalDeTransmisionId> {

    // se crean variables para los objectValue

    private AcuerdoDePago acuerdoDePago;
    private PaginasDeTransmision paginasDeTransmision;

    // se crea constructor para los objectValue
    public CanalDeTransmision(CanalDeTransmisionId canalDeTransmisionId, AcuerdoDePago acuerdoDePago, PaginasDeTransmision paginasDeTransmision){

        // Super --> Herencia
        super(canalDeTransmisionId);
        this.acuerdoDePago = acuerdoDePago;
        this.paginasDeTransmision = paginasDeTransmision;
    }

    // métodos de la entidad CanalDeTransmisión

    // cambiarPaginaTransmision()
    public void cambiarPaginasDeTransmision(PaginasDeTransmision paginasDeTransmision){
        this.paginasDeTransmision = Objects.requireNonNull(paginasDeTransmision);
    }

    // cambiarAcuerdoDePago()
    public void cambiarAcuerdoDePago(AcuerdoDePago acuerdoDePago){
        this.acuerdoDePago = Objects.requireNonNull(acuerdoDePago);
    }

}
