package br.com.bode.reactiveflashcards.domain.document;

public record Question(
        String asked,
        String answered,
        String expected) {
}
