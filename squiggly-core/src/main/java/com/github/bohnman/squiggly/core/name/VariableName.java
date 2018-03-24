package com.github.bohnman.squiggly.core.name;

public class VariableName extends ExactName {

    public VariableName(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "$" + getName();
    }
}
