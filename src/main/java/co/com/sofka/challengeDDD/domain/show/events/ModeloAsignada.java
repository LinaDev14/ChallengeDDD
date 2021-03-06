package co.com.sofka.challengeDDD.domain.show.events;

import co.com.sofka.challengeDDD.domain.show.ids.ModeloId;
import co.com.sofka.challengeDDD.domain.generics.Email;
import co.com.sofka.challengeDDD.domain.generics.Identificacion;
import co.com.sofka.challengeDDD.domain.generics.Nombre;
import co.com.sofka.domain.generic.DomainEvent;
import lombok.Getter;


@Getter
public class ModeloAsignada extends DomainEvent {

    private final ModeloId modeloId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final Email email;

    public ModeloAsignada(ModeloId modeloId, Nombre nombre, Identificacion identificacion, Email email) {
        super("co.com.sofka.challengeDDD.ModeloAsignada");
        this.modeloId = modeloId;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
    }
}
