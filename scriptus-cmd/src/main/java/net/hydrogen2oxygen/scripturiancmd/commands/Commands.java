package net.hydrogen2oxygen.scripturiancmd.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;


@ShellComponent
public class Commands {

    @ShellMethod("Lists all scripts and their descriptions")
    public String list() {
        return "hello! ... I'm not implemented yet, sorry.";
    }
}
