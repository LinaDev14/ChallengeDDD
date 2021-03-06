package co.com.sofka.challengeDDD.aplications.usecase.show.command;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.show.Show;
import co.com.sofka.challengeDDD.domain.show.commands.AsignarCanalDeTransmision;

public class AsignarCanalDeTransmisionUseCase extends UseCase<RequestCommand<AsignarCanalDeTransmision>, ResponseEvents> {

    // se implementa el método
    @Override
    public void executeUseCase(RequestCommand<AsignarCanalDeTransmision> input) {

        var command =  input.getCommand();
        // se recoge la instancia
        var show = Show.from(command.getShowId(), retrieveEvents());
        show.asignarCanalDeTransmision(command.getCanalDeTransmisionId(), command.getAcuerdoDePago(), command.getPaginasDeTransmision());
        emit().onResponse(new ResponseEvents(show.getUncommittedChanges()));
    }
}
