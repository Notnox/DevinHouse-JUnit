package devinhousejunit.eventos;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import devinhousejunit.modelo.Conta;
import devinhousejunit.modelo.Evento;

public class EventoListener implements PropertyChangeListener {
    private final Conta conta;

    public EventoListener(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        conta.registrarNovaOperacao((Evento) evt.getNewValue());
    }
}
