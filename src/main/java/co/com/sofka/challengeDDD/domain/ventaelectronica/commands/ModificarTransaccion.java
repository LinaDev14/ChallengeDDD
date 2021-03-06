package co.com.sofka.challengeDDD.domain.ventaelectronica.commands;

import co.com.sofka.challengeDDD.domain.show.ids.ShowId;
import co.com.sofka.challengeDDD.domain.ventaelectronica.ids.TransaccionId;
import co.com.sofka.challengeDDD.domain.ventaelectronica.ids.VentaElectronicaId;
import co.com.sofka.challengeDDD.domain.ventaelectronica.valueobjects.Fecha;
import co.com.sofka.challengeDDD.domain.ventaelectronica.valueobjects.ValorMoneda;
import co.com.sofka.domain.generic.Command;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ModificarTransaccion extends Command {

    private final ShowId showId;
    private final VentaElectronicaId ventaElectronicaId;
    private final TransaccionId transaccionId;
    private final ValorMoneda valorMoneda;
    private final Fecha fecha;

}
