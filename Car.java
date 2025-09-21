package org.example;


public record Car(long id, long arrivalEpochMillis) {
    @Override public String toString() { return "Car-" + id; }
}
