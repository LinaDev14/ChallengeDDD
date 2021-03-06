package co.com.sofka.challengeDDD.domain.show.commands;
import co.com.sofka.challengeDDD.domain.show.ids.MonitorId;
import co.com.sofka.challengeDDD.domain.show.ids.ShowId;
import co.com.sofka.challengeDDD.domain.show.valueobjects.AcuerdoDeConfidencialidad;
import co.com.sofka.challengeDDD.domain.generics.Identificacion;
import co.com.sofka.challengeDDD.domain.generics.Nombre;
import co.com.sofka.domain.generic.Command;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AsignarMonitor extends Command{

    private final ShowId showId;
    private final MonitorId monitorId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final AcuerdoDeConfidencialidad acuerdoDeConfidencialidad;

}
