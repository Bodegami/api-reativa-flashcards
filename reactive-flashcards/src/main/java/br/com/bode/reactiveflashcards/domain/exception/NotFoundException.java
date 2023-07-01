package br.com.bode.reactiveflashcards.domain.exception;

public class NotFoundException extends ReactiveFlashCardsException {
    public NotFoundException(String message) {
        super(message);
    }
}
