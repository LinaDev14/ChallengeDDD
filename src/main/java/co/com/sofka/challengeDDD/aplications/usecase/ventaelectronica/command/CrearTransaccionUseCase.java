package co.com.sofka.challengeDDD.aplications.usecase.ventaelectronica.command;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.ventaelectronica.VentaElectronica;
import co.com.sofka.challengeDDD.domain.ventaelectronica.commands.CrearTransaccion;

public class CrearTransaccionUseCase extends UseCase<RequestCommand<CrearTransaccion>, ResponseEvents> {

    // Se implementa el método

    @Override
    public void executeUseCase(RequestCommand<CrearTransaccion> input) {

        var command = input.getCommand();
        // se crea una nueva instancia
        var ventaElectronica = VentaElectronica.from (command.getVentaElectronicaId(), command.getShowId(), retrieveEvents());
        ventaElectronica.crearTransaccion(command.getTransaccionId(), command.getValorMoneda(), command.getFecha());
        emit().onResponse(new ResponseEvents(ventaElectronica.getUncommittedChanges()));
    }
}
